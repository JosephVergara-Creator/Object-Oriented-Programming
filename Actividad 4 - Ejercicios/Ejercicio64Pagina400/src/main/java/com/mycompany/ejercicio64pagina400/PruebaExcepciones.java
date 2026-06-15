/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio64pagina400;

/**
 *
 * @author Josep
 */
public class PruebaExcepciones {

    public String ejecutar(int dividendo, int divisor, boolean usarObjetoNulo,
            String textoObjeto) {
        StringBuilder salida = new StringBuilder();

        try {
            salida.append("Ingresando al primer try\n");
            int cociente = dividendo / divisor;
            salida.append("Resultado de la division: ").append(cociente).append("\n");
        } catch (ArithmeticException e) {
            salida.append("Division por cero\n");
        } finally {
            salida.append("Ingresando al primer finally\n");
        }

        try {
            salida.append("Ingresando al segundo try\n");
            Object objeto = usarObjetoNulo ? null : textoObjeto;
            String texto = objeto.toString();
            salida.append("Imprimiendo objeto: ").append(texto).append("\n");
        } catch (ArithmeticException e) {
            salida.append("Division por cero\n");
        } catch (Exception e) {
            salida.append("Ocurrio una excepcion\n");
        } finally {
            salida.append("Ingresando al segundo finally\n");
        }

        return salida.toString();
    }
}