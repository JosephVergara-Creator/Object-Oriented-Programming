/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopropueston17;

/**
 *
 * @author Josep
 */
public class Calculos {
    public static double calcular_longitud_circunferencia(double radio){
        return 2 * Math.PI * radio ;
    }
    public static double calcular_area_circulo(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
}