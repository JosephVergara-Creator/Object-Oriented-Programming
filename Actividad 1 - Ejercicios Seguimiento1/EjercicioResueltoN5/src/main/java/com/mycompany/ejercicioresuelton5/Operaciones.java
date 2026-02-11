/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioresuelton5;

/**
 *
 * @author Josep
 */
public class Operaciones {
    public static double calcular_x(double x, double y){
        return x + Math.pow(y, 2);
    }
    public static double calcular_suma(double suma_anterior, double x_actualizado, double y){
       return suma_anterior + x_actualizado/y; 
    }
}
