package com.sofftek.presentacion;

import com.sofftek.persistencia.Conexion;
import com.sofftek.persistencia.AccesoEmpleado;
import com.sofftek.persistencia.AccesoProducto;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Conexion c1 = new Conexion();
        c1.abrirConexion();
        AccesoProducto ap = new AccesoProducto();
        System.out.println(ap.obtenerTodos());
        AccesoEmpleado ae = new AccesoEmpleado();
        System.out.println(ae.obtenerTodos());
    }
}
