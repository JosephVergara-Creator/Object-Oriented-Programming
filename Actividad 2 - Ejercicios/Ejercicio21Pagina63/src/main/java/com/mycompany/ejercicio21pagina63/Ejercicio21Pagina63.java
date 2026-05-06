/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21pagina63;

import java.util.Scanner;
/**
 *
 * @author Josep
 */
public class Ejercicio21Pagina63 {

    public static void main(String[] args) {        
        
        String nombre;
        String apellidos;
        String numeroDocumentoIdentidad;
        int añoNacimiento;    
        
        Scanner datos_entrada_teclado = new Scanner(System.in);
                
        System.out.println("Ingrese el nombre: ");
        nombre = datos_entrada_teclado.next();
        
        System.out.println("Ingrese el apellido: ");
        apellidos = datos_entrada_teclado.next();
        
        System.out.println("Ingrese el numero de documento de identidad: ");
        numeroDocumentoIdentidad = datos_entrada_teclado.next();
        
        System.out.println("Ingrese el año de nacimiento: ");
        añoNacimiento = datos_entrada_teclado.nextInt();
        
        Persona persona1 = new Persona(nombre, apellidos, numeroDocumentoIdentidad, añoNacimiento);
        
        persona1.mostrar_datos_personales();
    }
}
