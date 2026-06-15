/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio66pagina412;

import java.util.InputMismatchException;

/**
 *
 * @author Josep
 */
public class CalculosNumericos {

    public static String calcularLogaritmoNeperiano(double valor) {
        try {
            if (valor < 0) {
                throw new ArithmeticException("El valor debe ser un numero positivo");
            }
            double resultado = Math.log(valor);
            return "Logaritmo neperiano = " + String.format("%.4f", resultado);
        } catch (ArithmeticException e) {
            return "El valor debe ser un numero positivo para calcular el logaritmo";
        } catch (InputMismatchException e) {
            return "El valor debe ser numerico para calcular el logaritmo";
        }
    }

    public static String calcularRaizCuadrada(double valor) {
        try {
            if (valor < 0) {
                throw new ArithmeticException("El valor debe ser un numero positivo");
            }
            double resultado = Math.sqrt(valor);
            return "Raiz cuadrada = " + String.format("%.4f", resultado);
        } catch (ArithmeticException e) {
            return "El valor debe ser un numero positivo para calcular la raiz cuadrada";
        } catch (InputMismatchException e) {
            return "El valor debe ser numerico para calcular la raiz cuadrada";
        }
    }
}

