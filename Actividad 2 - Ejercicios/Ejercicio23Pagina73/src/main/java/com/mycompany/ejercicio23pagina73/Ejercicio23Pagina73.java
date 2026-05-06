/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23pagina73;

import java.util.Scanner;

/**
 *
 * @author Josep
 */
public class Ejercicio23Pagina73 {

    public static void main(String[] args) {
        
        String marca;
        int modelo;
        int motor;
        String combustibleEntrada;
        String tipoAutoEntrada;
        int numeroPuertas;
        int cantidadAsientos;
        int velocidadMaxima;
        String colorEntrada;
        
        Scanner datos_entrada_teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la marca del automovil: ");
        marca = datos_entrada_teclado.next();
        
        System.out.println("Ingrese el modelo (año de fabricacion): ");
        modelo = datos_entrada_teclado.nextInt();
        
        System.out.println("Ingrese el motor (cilindraje en litros): ");
        motor = datos_entrada_teclado.nextInt();
        
        System.out.println("Ingrese el tipo de combustible (GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL): ");
        combustibleEntrada = datos_entrada_teclado.next();
        tipoCombustible combustible = tipoCombustible.valueOf(combustibleEntrada.toUpperCase());
        
        System.out.println("Ingrese el tipo de automovil (CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV): ");
        tipoAutoEntrada = datos_entrada_teclado.next();
        tipoAutomovil tipoAuto = tipoAutomovil.valueOf(tipoAutoEntrada.toUpperCase());
        
        System.out.println("Ingrese el numero de puertas: ");
        numeroPuertas = datos_entrada_teclado.nextInt();
        
        System.out.println("Ingrese la cantidad de asientos: ");
        cantidadAsientos = datos_entrada_teclado.nextInt();
        
        System.out.println("Ingrese la velocidad maxima (km/h): ");
        velocidadMaxima = datos_entrada_teclado.nextInt();
        
        System.out.println("Ingrese el color (BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA): ");
        colorEntrada = datos_entrada_teclado.next();
        tipoColor color = tipoColor.valueOf(colorEntrada.toUpperCase());
        
        Automovil auto1 = new Automovil(marca, modelo, motor, combustible,
                tipoAuto, numeroPuertas, cantidadAsientos, velocidadMaxima, color);
        
        auto1.imprimir();
        
        System.out.println("Ingrese la velocidad actual (km/h): ");
        int velocidadActual = datos_entrada_teclado.nextInt();
        auto1.setVelocidadActual(velocidadActual);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        
        System.out.println("Ingrese el incremento de velocidad (km/h): ");
        int incrementoVelocidad = datos_entrada_teclado.nextInt();
        auto1.acelerar(incrementoVelocidad);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        
        System.out.println("Ingrese el decremento de velocidad (km/h): ");
        int decrementoVelocidad = datos_entrada_teclado.nextInt();
        auto1.desacelerar(decrementoVelocidad);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        
        auto1.frenar();
        System.out.println("Velocidad actual tras frenar = " + auto1.getVelocidadActual());
    }
}
