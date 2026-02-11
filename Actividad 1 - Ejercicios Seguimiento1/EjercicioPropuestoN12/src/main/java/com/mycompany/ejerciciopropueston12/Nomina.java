/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopropueston12;

/**
 *
 * @author Josep
 */
public class Nomina {
    public static double calcular_salario_bruto(double horas_trabajadas, double valor_hora){
        return horas_trabajadas * valor_hora;
    }
    public static double calcular_valor_retefuente(double porcentaje_retefuente, double salario_bruto){
        return porcentaje_retefuente * salario_bruto;
    }
    public static double calcular_salario_neto(double salario_bruto, double valor_retefuente){
        return salario_bruto - valor_retefuente;
    }
}
