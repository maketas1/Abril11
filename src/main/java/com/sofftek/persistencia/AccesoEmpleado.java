package com.sofftek.persistencia;

import com.sofftek.modelo.Empleado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoEmpleado extends Conexion {

    public List<Empleado> obtenerTodos() throws SQLException, ClassNotFoundException {
        Statement sentencias;
        ResultSet resultado;
        String sql = "Select employee_id, last_name, first_name, reports_to from products;";
        List<Empleado> productos = new ArrayList<>();
        abrirConexion();
        sentencias = miConexion.createStatement();
        resultado = sentencias.executeQuery(sql);
        while (resultado.next()) {
            productos.add(new Empleado(
                    resultado.getInt("employee_id"),
                    resultado.getString("last_name"),
                    resultado.getString("first_name"),
                    resultado.getInt("reports_to")
            ));
        }
        return productos;
    }

    public void alta(Empleado e) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO employees (employee_id, last_name, first_name, reports_to) VALUES (?, ?, ?, ?);";
        abrirConexion();
        PreparedStatement sentencia = miConexion.prepareStatement(sql);
        sentencia.setInt(1, e.getIdEmpleado());
        sentencia.setString(2, e.getApellidos());
        sentencia.setString(3, e.getNombre());
        sentencia.setInt(4, e.getJefe());
        sentencia.executeUpdate();
    }
}
