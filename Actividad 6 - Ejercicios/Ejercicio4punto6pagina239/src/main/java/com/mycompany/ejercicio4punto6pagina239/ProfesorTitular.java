/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4punto6pagina239;

/**
 *
 * @author Josep
 */
public class ProfesorTitular extends Profesor {
    int anios = 0;
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
    protected void imprimirAnios() {
        System.out.println("Años = " + anios);
    }
}
