/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio83pagina495;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Josep
 */
public class VentanaCilindro extends JFrame implements ActionListener {
 
    private Container contenedor;
    private JLabel lblTitulo, radio, altura, volumen, superficie;
    private JTextField campoRadio, campoAltura;
    private JButton calcular;
 
    public VentanaCilindro() {
        inicio();
        setTitle("Cilindro");
        setSize(320, 270);
        setLocationRelativeTo(null);
        setResizable(false);
    }
 
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(245, 247, 250));
 
        lblTitulo = new JLabel("Cilindro");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblTitulo.setForeground(new Color(52, 152, 219));
        lblTitulo.setBounds(20, 15, 280, 25);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
 
        radio = new JLabel("Radio (cms):");
        radio.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        radio.setForeground(new Color(60, 60, 60));
        radio.setBounds(20, 55, 120, 23);
 
        campoRadio = new JTextField();
        campoRadio.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campoRadio.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                new EmptyBorder(2, 5, 2, 5)));
        campoRadio.setBounds(145, 55, 140, 23);
 
        altura = new JLabel("Altura (cms):");
        altura.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        altura.setForeground(new Color(60, 60, 60));
        altura.setBounds(20, 90, 120, 23);
 
        campoAltura = new JTextField();
        campoAltura.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campoAltura.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                new EmptyBorder(2, 5, 2, 5)));
        campoAltura.setBounds(145, 90, 140, 23);
 
        calcular = new JButton("Calcular");
        calcular.setFont(new Font("Segoe UI", Font.BOLD, 13));
        calcular.setBackground(new Color(52, 152, 219));
        calcular.setForeground(Color.WHITE);
        calcular.setFocusPainted(false);
        calcular.setBorderPainted(false);
        calcular.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calcular.setBounds(90, 128, 135, 32);
        calcular.addActionListener(this);
 
        JSeparator sep = new JSeparator();
        sep.setBounds(20, 175, 275, 2);
        sep.setForeground(new Color(220, 220, 220));
 
        volumen = new JLabel("Volumen (cm3):");
        volumen.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        volumen.setForeground(new Color(60, 60, 60));
        volumen.setBounds(20, 185, 280, 23);
 
        superficie = new JLabel("Superficie (cm2):");
        superficie.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        superficie.setForeground(new Color(60, 60, 60));
        superficie.setBounds(20, 215, 280, 23);
 
        contenedor.add(lblTitulo);
        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(calcular);
        contenedor.add(sep);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }
 
    @Override
    public void actionPerformed(ActionEvent evento) {
        boolean error = false;
        double radioVal = 0;
        double alturaVal = 0;
        try {
            radioVal = Double.parseDouble(campoRadio.getText());
            alturaVal = Double.parseDouble(campoAltura.getText());
            Cilindro cilindro = new Cilindro(radioVal, alturaVal);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", cilindro.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", cilindro.calcularSuperficie()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null,
                        "Campo vacio o formato de numero incorrecto.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}