/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio82pagina483;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Josep
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
 
    private Container contenedor;
 
    private JLabel lblTitulo, lblNota1, lblNota2, lblNota3, lblNota4, lblNota5;
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    private JButton calcular, limpiar;
    private JPanel panelResultados;
    private JLabel lblPromedio, lblDesviacion, lblMayor, lblMenor;
    private JLabel valPromedio, valDesviacion, valMayor, valMenor;
 
    public VentanaPrincipal() {
        inicio();
        setTitle("Calculadora de Notas");
        setSize(420, 520);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
 
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(245, 247, 250));
 
        lblTitulo = new JLabel("Registro de Notas");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitulo.setForeground(new Color(44, 62, 80));
        lblTitulo.setBounds(20, 20, 380, 30);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
 
        JPanel panelNotas = new JPanel(null);
        panelNotas.setBackground(Color.WHITE);
        panelNotas.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        panelNotas.setBounds(20, 65, 375, 220);
 
        JLabel lblEncabezado = new JLabel("Ingrese las 5 notas del estudiante:");
        lblEncabezado.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblEncabezado.setForeground(new Color(100, 100, 100));
        lblEncabezado.setBounds(15, 10, 340, 20);
 
        String[] nombresNotas = {"Nota 1:", "Nota 2:", "Nota 3:", "Nota 4:", "Nota 5:"};
        JLabel[] etiquetas = new JLabel[5];
        JTextField[] campos = new JTextField[]{
            campoNota1 = new JTextField(),
            campoNota2 = new JTextField(),
            campoNota3 = new JTextField(),
            campoNota4 = new JTextField(),
            campoNota5 = new JTextField()
        };
 
        for (int i = 0; i < 5; i++) {
            etiquetas[i] = new JLabel(nombresNotas[i]);
            etiquetas[i].setFont(new Font("Segoe UI", Font.PLAIN, 13));
            etiquetas[i].setForeground(new Color(60, 60, 60));
            etiquetas[i].setBounds(15, 40 + i * 33, 80, 23);
 
            campos[i].setFont(new Font("Segoe UI", Font.PLAIN, 13));
            campos[i].setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 200, 200)),
                    new EmptyBorder(2, 5, 2, 5)));
            campos[i].setBounds(100, 40 + i * 33, 255, 23);
 
            panelNotas.add(etiquetas[i]);
            panelNotas.add(campos[i]);
        }
        panelNotas.add(lblEncabezado);
 
        calcular = new JButton("Calcular");
        calcular.setFont(new Font("Segoe UI", Font.BOLD, 13));
        calcular.setBackground(new Color(52, 152, 219));
        calcular.setForeground(Color.WHITE);
        calcular.setFocusPainted(false);
        calcular.setBorderPainted(false);
        calcular.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calcular.setBounds(20, 300, 175, 35);
        calcular.addActionListener(this);
 
        limpiar = new JButton("Limpiar");
        limpiar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        limpiar.setBackground(new Color(149, 165, 166));
        limpiar.setForeground(Color.WHITE);
        limpiar.setFocusPainted(false);
        limpiar.setBorderPainted(false);
        limpiar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        limpiar.setBounds(220, 300, 175, 35);
        limpiar.addActionListener(this);
 
        panelResultados = new JPanel(null);
        panelResultados.setBackground(Color.WHITE);
        panelResultados.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        panelResultados.setBounds(20, 350, 375, 130);
 
        JLabel lblResEncabezado = new JLabel("Resultados:");
        lblResEncabezado.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lblResEncabezado.setForeground(new Color(44, 62, 80));
        lblResEncabezado.setBounds(15, 10, 200, 20);
 
        lblPromedio = new JLabel("Promedio:");
        lblDesviacion = new JLabel("Desviacion estandar:");
        lblMayor = new JLabel("Nota mayor:");
        lblMenor = new JLabel("Nota menor:");
 
        valPromedio = new JLabel("-");
        valDesviacion = new JLabel("-");
        valMayor = new JLabel("-");
        valMenor = new JLabel("-");
 
        JLabel[] etiqRes = {lblPromedio, lblDesviacion, lblMayor, lblMenor};
        JLabel[] valRes = {valPromedio, valDesviacion, valMayor, valMenor};
 
        for (int i = 0; i < 4; i++) {
            etiqRes[i].setFont(new Font("Segoe UI", Font.PLAIN, 12));
            etiqRes[i].setForeground(new Color(80, 80, 80));
            etiqRes[i].setBounds(15, 35 + i * 22, 160, 18);
 
            valRes[i].setFont(new Font("Segoe UI", Font.BOLD, 12));
            valRes[i].setForeground(new Color(41, 128, 185));
            valRes[i].setBounds(180, 35 + i * 22, 180, 18);
 
            panelResultados.add(etiqRes[i]);
            panelResultados.add(valRes[i]);
        }
        panelResultados.add(lblResEncabezado);
 
        contenedor.add(lblTitulo);
        contenedor.add(panelNotas);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(panelResultados);
    }
 
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            try {
                Notas notas = new Notas();
                notas.listaNotas[0] = Double.parseDouble(campoNota1.getText());
                notas.listaNotas[1] = Double.parseDouble(campoNota2.getText());
                notas.listaNotas[2] = Double.parseDouble(campoNota3.getText());
                notas.listaNotas[3] = Double.parseDouble(campoNota4.getText());
                notas.listaNotas[4] = Double.parseDouble(campoNota5.getText());
 
                valPromedio.setText(String.format("%.2f", notas.calcularPromedio()));
                valDesviacion.setText(String.format("%.2f", notas.calcularDesviacion()));
                valMayor.setText(String.valueOf(notas.calcularMayor()));
                valMenor.setText(String.valueOf(notas.calcularMenor()));
 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Campo vacio o formato de numero incorrecto.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (evento.getSource() == limpiar) {
            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            campoNota5.setText("");
            valPromedio.setText("-");
            valDesviacion.setText("-");
            valMayor.setText("-");
            valMenor.setText("-");
        }
    }
}
