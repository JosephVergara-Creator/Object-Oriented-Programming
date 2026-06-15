/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio68pagina427;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Josep
 */
public class LeerArchivo {

    public String leer(String nombreArchivo) throws IOException {
        FileInputStream archivo;
        InputStreamReader conversor;
        BufferedReader filtro;
        String linea;
        StringBuilder contenido = new StringBuilder();

        archivo = new FileInputStream(nombreArchivo);
        conversor = new InputStreamReader(archivo);
        filtro = new BufferedReader(conversor);
        linea = filtro.readLine();
        while (linea != null) {
            contenido.append(linea).append("\n");
            linea = filtro.readLine();
        }
        filtro.close();
        return contenido.toString();
    }
}

