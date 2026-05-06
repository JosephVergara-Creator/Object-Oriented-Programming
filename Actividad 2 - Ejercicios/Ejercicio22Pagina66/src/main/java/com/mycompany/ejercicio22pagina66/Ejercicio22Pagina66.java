/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio22pagina66;
import java.util.Scanner;

/**
 *
 * @author Josep
 */
public class Ejercicio22Pagina66 {

    public static void main(String[] args) {
        
        String nombre;
        int cantidadSatelites;
        double masa;
        double volumen;
        int diametro;
        int distanciaSol;
        
        Scanner datos_entrada_teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        nombre = datos_entrada_teclado.next();
        
        System.out.println("Ingrese la cantidad de satelites: ");
        cantidadSatelites = datos_entrada_teclado.nextInt();
        
        System.out.println("Ingrese la masa del planeta: ");
        masa = datos_entrada_teclado.nextDouble();
        
        System.out.println("Ingrese el volumen del planeta: ");
        volumen = datos_entrada_teclado.nextDouble();
        
        System.out.println("Ingrese el diametro del planeta: ");
        diametro = datos_entrada_teclado.nextInt();
        
        System.out.println("Ingrese la distancia del planeta al sol: ");
        distanciaSol = datos_entrada_teclado.nextInt();
        
        Planeta p1 = new Planeta(nombre,cantidadSatelites,masa,volumen,diametro,distanciaSol,tipoPlaneta.TERRESTRE,true);
        System.out.println("*******************************");
        p1.imprimir();
        System.out.println("Densidad del planeta = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());
        System.out.println("*******************************");
    }
}
