/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio24pagina86;

/**
 *
 * @author Josep
 */
public class TrianguloRectangulo {
    int base;
    int altura;

TrianguloRectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }

double calcularArea() {
    return (base * altura / 2);
    }

double calcularPerimetro() {
    return (base + altura + calcularHipotenusa());
    }

double calcularHipotenusa() {
    return Math.pow(base * base + altura * altura, 0.5);
    }

void determinarTipoTriangulo() {
    if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
        System.out.println("Es un triangulo equilatero");
    else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
        System.out.println("Es un triangulo escaleno");
    else
        System.out.println("Es un triangulo isosceles");
    }
}
