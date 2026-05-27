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
public class VentanaEsfera extends JFrame implements ActionListener {
 
    private Container contenedor;
    private JLabel lblTitulo, radio, volumen, superficie;
    private JTextField campoRadio;
    private JButton calcular;
 
    public VentanaEsfera() {
        inicio();
        setTitle("Esfera");
        setSize(320, 230);
        setLocationRelativeTo(null);
        setResizable(false);
    }
 
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(245, 247, 250));
 
        lblTitulo = new JLabel("Esfera");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblTitulo.setForeground(new Color(46, 204, 113));
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
 
        calcular = new JButton("Calcular");
        calcular.setFont(new Font("Segoe UI", Font.BOLD, 13));
        calcular.setBackground(new Color(46, 204, 113));
        calcular.setForeground(Color.WHITE);
        calcular.setFocusPainted(false);
        calcular.setBorderPainted(false);
        calcular.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calcular.setBounds(90, 90, 135, 32);
        calcular.addActionListener(this);
 
        JSeparator sep = new JSeparator();
        sep.setBounds(20, 135, 275, 2);
        sep.setForeground(new Color(220, 220, 220));
 
        volumen = new JLabel("Volumen (cm3):");
        volumen.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        volumen.setForeground(new Color(60, 60, 60));
        volumen.setBounds(20, 145, 280, 23);
 
        superficie = new JLabel("Superficie (cm2):");
        superficie.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        superficie.setForeground(new Color(60, 60, 60));
        superficie.setBounds(20, 175, 280, 23);
 
        contenedor.add(lblTitulo);
        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(calcular);
        contenedor.add(sep);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }
 
    @Override
    public void actionPerformed(ActionEvent evento) {
        boolean error = false;
        try {
            double radioVal = Double.parseDouble(campoRadio.getText());
            Esfera esfera = new Esfera(radioVal);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", esfera.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", esfera.calcularSuperficie()));
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
