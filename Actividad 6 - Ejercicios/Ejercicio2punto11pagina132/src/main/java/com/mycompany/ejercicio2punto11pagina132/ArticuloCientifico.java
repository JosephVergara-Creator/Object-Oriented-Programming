/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2punto11pagina132;

/**
 *
 * @author Josep
 */
public class ArticuloCientifico {
    String titulo;
    String autor;
    String[] palabrasClaves = new String[3];
    String publicacion;
    int anio;
    String resumen;
 
    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
 
    public ArticuloCientifico(String titulo, String autor, String[] palabrasClaves,
            String publicacion, int anio) {
        this(titulo, autor);
        this.palabrasClaves = palabrasClaves;
        this.publicacion = publicacion;
        this.anio = anio;
    }
 
    public ArticuloCientifico(String titulo, String autor, String[] palabrasClaves,
            String publicacion, int anio, String resumen) {
        this(titulo, autor, palabrasClaves, publicacion, anio);
        this.resumen = resumen;
    }
 
    public void imprimir() {
        System.out.println("Título del artículo = " + titulo);
        System.out.println("Autor del artículo = " + autor);
        System.out.println("Palabras clave = ");
        for (int i = 0; i < palabrasClaves.length; i++) {
            System.out.println(palabrasClaves[i]);
        }
        System.out.println("Publicación = " + publicacion);
        System.out.println("Año = " + anio);
        System.out.println("Resumen = " + resumen);
    }
}