/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio24pagina86;

import java.util.Scanner;

/**
 *
 * @author Josep
 */
public class Ejercicio24Pagina86 {

    public static void main(String[] args) {
        
        int radioCirculo;
        int baseRectangulo;
        int alturaRectangulo;
        int ladoCuadrado;
        int baseTriangulo;
        int alturaTriangulo;
        
        Scanner datos_entrada_teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo: ");
        radioCirculo = datos_entrada_teclado.nextInt();
        Circulo figura1 = new Circulo(radioCirculo);
        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
        System.out.println();
        
        System.out.println("Ingrese la base del rectangulo: ");
        baseRectangulo = datos_entrada_teclado.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        alturaRectangulo = datos_entrada_teclado.nextInt();
        Rectangulo figura2 = new Rectangulo(baseRectangulo, alturaRectangulo);
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetro());
        System.out.println();
        
        System.out.println("Ingrese el lado del cuadrado: ");
        ladoCuadrado = datos_entrada_teclado.nextInt();
        Cuadrado figura3 = new Cuadrado(ladoCuadrado);
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        
        System.out.println("Ingrese la base del triangulo rectangulo: ");
        baseTriangulo = datos_entrada_teclado.nextInt();
        System.out.println("Ingrese la altura del triangulo rectangulo: ");
        alturaTriangulo = datos_entrada_teclado.nextInt();
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}
