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
        double suma, x, y;
        suma = 0;
        x = 20;
        y = 40;
        
        suma += x;
        x += Math.pow(y, 2);
        suma += x/y;
        
        System.out.println("El valor de x es : " + x);
        System.out.println("El valor de y es : " + y);
        System.out.println("El valor de la suma es: " + suma);
    }
}
