/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopropueston17;

/**
 *
 * @author Josep
 */
public class EjercicioPropuestoN17 {

    public static void main(String[] args) {
        double radio = 3;
        double longitud_circunferencia = Calculos.calcular_longitud_circunferencia(radio);
        double area_circulo = Calculos.calcular_area_circulo(radio);
        System.out.println("La longitud de la circunferencia es = " + longitud_circunferencia);
        System.out.println("El area de la circunferencia es = " + area_circulo);
    }
}
