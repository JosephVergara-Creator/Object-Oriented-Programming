/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio65pagina406;

/**
 *
 * @author Josep
 */
public class Vendedor {

    private String nombre;
    private String apellidos;
    private int edad;         
    
    public Vendedor(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String imprimir() {
        return "Nombre del vendedor = " + nombre + "\n"
                + "Apellidos del vendedor = " + apellidos + "\n"
                + "Edad del vendedor = " + edad;
    }

    public void verificarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 anos.");
        }
        if (edad >= 0 && edad < 120) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
}
