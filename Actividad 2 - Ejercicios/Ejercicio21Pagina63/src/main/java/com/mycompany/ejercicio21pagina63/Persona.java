/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio21pagina63;

/**
 *
 * @author Josep
 */
public class Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int añoNacimiento;
    
Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int añoNacimiento) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    this.añoNacimiento = añoNacimiento;
    }
        
void mostrar_datos_personales() {
    System.out.println("Nombre = " + nombre);
    System.out.println("Apellidos = " + apellidos);
    System.out.println("Número de documento de identidad = " + 
    numeroDocumentoIdentidad);
    System.out.println("Año de nacimiento = " + añoNacimiento);
    System.out.println();
    }
}
