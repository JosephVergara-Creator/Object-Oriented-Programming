/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelton5;

/**
 *
 * @author Josep
 */
public class EjercicioResueltoN5 {

    public static void main(String[] args) {
        double x = 20;
        double y = 40;
        double suma = 0;
        suma += x;
        x = Operaciones.calcular_x(x, y);
        suma = Operaciones.calcular_suma(suma, x, y);
        System.out.println("El valor de x es = " + x);
        System.out.println("El valor de y es = " + y);
        System.out.println("El valor de la suma es = " + suma);
    }
}
