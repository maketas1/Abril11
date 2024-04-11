package com.sofftek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Empleado {
    private int idEmpleado;
    private String Nombre;
    private String Apellidos;
    private int Jefe;
}
