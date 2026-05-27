/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio83pagina495;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Josep
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
 
    private Container contenedor;
    private JButton cilindro, esfera, piramide;
    private JLabel lblTitulo, lblSubtitulo;
 
    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras Geometricas 3D");
        setSize(380, 280);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
 
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(245, 247, 250));
 
        lblTitulo = new JLabel("Figuras Geometricas 3D");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitulo.setForeground(new Color(44, 62, 80));
        lblTitulo.setBounds(20, 25, 340, 30);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
 
        lblSubtitulo = new JLabel("Seleccione una figura para calcular volumen y superficie:");
        lblSubtitulo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblSubtitulo.setForeground(new Color(100, 100, 100));
        lblSubtitulo.setBounds(20, 60, 340, 20);
        lblSubtitulo.setHorizontalAlignment(SwingConstants.CENTER);
 
        JSeparator sep = new JSeparator();
        sep.setBounds(20, 90, 335, 2);
        sep.setForeground(new Color(220, 220, 220));
 
        cilindro = crearBoton("Cilindro", new Color(52, 152, 219), 40, 110);
        esfera = crearBoton("Esfera", new Color(46, 204, 113), 40, 160);
        piramide = crearBoton("Piramide", new Color(155, 89, 182), 40, 210);
 
        contenedor.add(lblTitulo);
        contenedor.add(lblSubtitulo);
        contenedor.add(sep);
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
    }
 
    private JButton crearBoton(String texto, Color color, int x, int y) {
        JButton btn = new JButton(texto);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setBounds(x, y, 295, 35);
        btn.addActionListener(this);
        return btn;
    }
 
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) {
            VentanaEsfera ventanaEsfera = new VentanaEsfera();
            ventanaEsfera.setVisible(true);
        }
        if (evento.getSource() == cilindro) {
            VentanaCilindro ventanaCilindro = new VentanaCilindro();
            ventanaCilindro.setVisible(true);
        }
        if (evento.getSource() == piramide) {
            VentanaPiramide ventanaPiramide = new VentanaPiramide();
            ventanaPiramide.setVisible(true);
        }
    }
}
