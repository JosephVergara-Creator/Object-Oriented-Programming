/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio24pagina86;

/**
 *
 * @author Josep
 */
public class Circulo {
    int radio;

Circulo(int radio) {
    this.radio = radio;
    }

double calcularArea() {
    return Math.PI * Math.pow(radio, 2);
    }

double calcularPerimetro() {
    return 2 * Math.PI * radio;
    }
}
