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
public class VentanaPiramide extends JFrame implements ActionListener {
 
    private Container contenedor;
    private JLabel lblTitulo, base, altura, apotema, volumen, superficie;
    private JTextField campoBase, campoAltura, campoApotema;
    private JButton calcular;
 
    public VentanaPiramide() {
        inicio();
        setTitle("Piramide");
        setSize(320, 300);
        setLocationRelativeTo(null);
        setResizable(false);
    }
 
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(245, 247, 250));
 
        lblTitulo = new JLabel("Piramide");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblTitulo.setForeground(new Color(155, 89, 182));
        lblTitulo.setBounds(20, 15, 280, 25);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
 
        base = new JLabel("Base (cms):");
        base.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        base.setForeground(new Color(60, 60, 60));
        base.setBounds(20, 55, 120, 23);
 
        campoBase = new JTextField();
        campoBase.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campoBase.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                new EmptyBorder(2, 5, 2, 5)));
        campoBase.setBounds(145, 55, 140, 23);
 
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
 
        apotema = new JLabel("Apotema (cms):");
        apotema.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        apotema.setForeground(new Color(60, 60, 60));
        apotema.setBounds(20, 125, 120, 23);
 
        campoApotema = new JTextField();
        campoApotema.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campoApotema.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                new EmptyBorder(2, 5, 2, 5)));
        campoApotema.setBounds(145, 125, 140, 23);
 
        calcular = new JButton("Calcular");
        calcular.setFont(new Font("Segoe UI", Font.BOLD, 13));
        calcular.setBackground(new Color(155, 89, 182));
        calcular.setForeground(Color.WHITE);
        calcular.setFocusPainted(false);
        calcular.setBorderPainted(false);
        calcular.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calcular.setBounds(90, 162, 135, 32);
        calcular.addActionListener(this);
 
        JSeparator sep = new JSeparator();
        sep.setBounds(20, 207, 275, 2);
        sep.setForeground(new Color(220, 220, 220));
 
        volumen = new JLabel("Volumen (cm3):");
        volumen.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        volumen.setForeground(new Color(60, 60, 60));
        volumen.setBounds(20, 217, 280, 23);
 
        superficie = new JLabel("Superficie (cm2):");
        superficie.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        superficie.setForeground(new Color(60, 60, 60));
        superficie.setBounds(20, 247, 280, 23);
 
        contenedor.add(lblTitulo);
        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(apotema);
        contenedor.add(campoApotema);
        contenedor.add(calcular);
        contenedor.add(sep);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }
 
    @Override
    public void actionPerformed(ActionEvent evento) {
        boolean error = false;
        try {
            double baseVal = Double.parseDouble(campoBase.getText());
            double alturaVal = Double.parseDouble(campoAltura.getText());
            double apotemaVal = Double.parseDouble(campoApotema.getText());
            Piramide piramide = new Piramide(baseVal, alturaVal, apotemaVal);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", piramide.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", piramide.calcularSuperficie()));
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
