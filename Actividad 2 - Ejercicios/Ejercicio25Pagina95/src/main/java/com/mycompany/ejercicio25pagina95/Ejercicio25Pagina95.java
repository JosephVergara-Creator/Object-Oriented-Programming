/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio25pagina95;

import java.util.Scanner;

/**
 *
 * @author Josep
 */
public class Ejercicio25Pagina95 {

    public static void main(String[] args) {
        
        String nombresTitular;
        String apellidosTitular;
        int numeroCuenta;
        int opcion;
        int valor;
        
        Scanner datos_entrada_teclado = new Scanner(System.in);
        
        System.out.println("--- Creacion de cuenta bancaria ---");
        
        System.out.println("Ingrese los nombres del titular: ");
        nombresTitular = datos_entrada_teclado.next();
        
        System.out.println("Ingrese los apellidos del titular: ");
        apellidosTitular = datos_entrada_teclado.next();
        
        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = datos_entrada_teclado.nextInt();
        
        CuentaBancaria cuenta = new CuentaBancaria(nombresTitular, apellidosTitular, numeroCuenta, tipoCuenta.AHORROS);
        
        System.out.println();
        System.out.println("Cuenta creada exitosamente.");
        cuenta.imprimir();
        
        do {
            System.out.println();
            System.out.println("--- Menu de operaciones ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consignar");
            System.out.println("3. Retirar");
            System.out.println("4. Finalizar");
            System.out.println("Seleccione una opcion: ");
            opcion = datos_entrada_teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    cuenta.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Ingrese el valor a consignar: ");
                    valor = datos_entrada_teclado.nextInt();
                    cuenta.consignar(valor);
                    break;
                case 3:
                    System.out.println("Ingrese el valor a retirar: ");
                    valor = datos_entrada_teclado.nextInt();
                    cuenta.retirar(valor);
                    break;
                case 4:
                    System.out.println("Sesion finalizada.");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}
