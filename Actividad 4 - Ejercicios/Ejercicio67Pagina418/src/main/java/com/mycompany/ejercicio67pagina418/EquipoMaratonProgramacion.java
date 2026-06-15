/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio67pagina418;

/**
 *
 * @author Josep
 */
public class EquipoMaratonProgramacion {

    private String nombreEquipo;
    private String universidad;
    private String lenguajeProgramacion;
    private Programador[] programadores;
    private int tamanoEquipo;

    public EquipoMaratonProgramacion(String nombreEquipo, String universidad,
            String lenguajeProgramacion) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.tamanoEquipo = 0;
        this.programadores = new Programador[3];
    }

    public boolean estaLleno() {
        return tamanoEquipo == programadores.length;
    }

    public void anadir(Programador programador) throws Exception {
        if (estaLleno()) {
            throw new Exception("El equipo esta completo. No se pudo agregar programador.");
        }
        programadores[tamanoEquipo] = programador;
        tamanoEquipo++;
    }

    public static void validarCampo(String campo) throws Exception {
        for (int j = 0; j < campo.length(); j++) {
            char c = campo.charAt(j);
            if (Character.isDigit(c)) {
                throw new Exception("El nombre no puede tener digitos.");
            }
        }
        if (campo.length() > 20) {
            throw new Exception("La longitud no debe ser superior a 20 caracteres.");
        }
    }

    public int getTamanoEquipo() {
        return tamanoEquipo;
    }

    public Programador[] getProgramadores() {
        return programadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }
}

