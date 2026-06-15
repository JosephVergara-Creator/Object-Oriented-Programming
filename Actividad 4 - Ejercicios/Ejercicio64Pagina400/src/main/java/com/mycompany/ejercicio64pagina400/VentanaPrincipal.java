/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio64pagina400;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.*;

/**
 *
 * @author Josep
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
 
    private Container contenedor;
    private JLabel lblTitulo, lblDividendo, lblDivisor, lblObjeto;
    private JTextField campoDividendo, campoDivisor, campoObjeto;
    private JCheckBox chkObjetoNulo;
    private JButton ejecutar, limpiar;
    private JPanel panelDatos;
    private JTextPane areaSalida;
    private static final Color COLOR_TRY      = new Color(52, 152, 219);   // azul   — "Ingresando al... try"
    private static final Color COLOR_FINALLY  = new Color(149, 165, 166);  // gris   — "Ingresando al... finally"
    private static final Color COLOR_ERROR    = new Color(231, 76, 60);    // rojo   — excepciones
    private static final Color COLOR_OK       = new Color(39, 174, 96);    // verde  — resultados exitosos
    private static final Color COLOR_DEFAULT  = new Color(44, 62, 80);     // texto base
 
    public VentanaPrincipal() {
        inicio();
        setTitle("Prueba de Excepciones");
        setSize(460, 580);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
 
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(245, 247, 250));
 
        lblTitulo = new JLabel("Prueba de Excepciones");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitulo.setForeground(new Color(44, 62, 80));
        lblTitulo.setBounds(20, 20, 415, 30);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
 
        panelDatos = new JPanel(null);
        panelDatos.setBackground(Color.WHITE);
        panelDatos.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        panelDatos.setBounds(20, 60, 415, 175);
 
        JLabel lblEncabezado = new JLabel("Ingrese los datos del programa:");
        lblEncabezado.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblEncabezado.setForeground(new Color(100, 100, 100));
        lblEncabezado.setBounds(15, 10, 360, 20);
 
        lblDividendo = new JLabel("Dividendo:");
        lblDividendo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblDividendo.setForeground(new Color(60, 60, 60));
        lblDividendo.setBounds(15, 42, 110, 23);
 
        campoDividendo = new JTextField("10000");
        campoDividendo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campoDividendo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                new EmptyBorder(2, 5, 2, 5)));
        campoDividendo.setBounds(135, 42, 260, 23);
 
        lblDivisor = new JLabel("Divisor:");
        lblDivisor.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblDivisor.setForeground(new Color(60, 60, 60));
        lblDivisor.setBounds(15, 77, 110, 23);
 
        campoDivisor = new JTextField("0");
        campoDivisor.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campoDivisor.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                new EmptyBorder(2, 5, 2, 5)));
        campoDivisor.setBounds(135, 77, 260, 23);
 
        lblObjeto = new JLabel("Objeto (texto):");
        lblObjeto.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblObjeto.setForeground(new Color(60, 60, 60));
        lblObjeto.setBounds(15, 112, 110, 23);
 
        campoObjeto = new JTextField("Hola mundo");
        campoObjeto.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campoObjeto.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                new EmptyBorder(2, 5, 2, 5)));
        campoObjeto.setBounds(135, 112, 260, 23);
 
        chkObjetoNulo = new JCheckBox("Usar objeto nulo (genera excepcion)");
        chkObjetoNulo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        chkObjetoNulo.setForeground(new Color(60, 60, 60));
        chkObjetoNulo.setBackground(Color.WHITE);
        chkObjetoNulo.setBounds(133, 140, 280, 23);
        chkObjetoNulo.setFocusPainted(false);
        chkObjetoNulo.setSelected(true);
        chkObjetoNulo.addActionListener(e
                -> campoObjeto.setEnabled(!chkObjetoNulo.isSelected()));
        campoObjeto.setEnabled(false);
 
        panelDatos.add(lblEncabezado);
        panelDatos.add(lblDividendo);
        panelDatos.add(campoDividendo);
        panelDatos.add(lblDivisor);
        panelDatos.add(campoDivisor);
        panelDatos.add(lblObjeto);
        panelDatos.add(campoObjeto);
        panelDatos.add(chkObjetoNulo);
 
        ejecutar = new JButton("Ejecutar");
        ejecutar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        ejecutar.setBackground(new Color(52, 152, 219));
        ejecutar.setForeground(Color.WHITE);
        ejecutar.setFocusPainted(false);
        ejecutar.setBorderPainted(false);
        ejecutar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ejecutar.setBounds(20, 248, 200, 35);
        ejecutar.addActionListener(this);
 
        limpiar = new JButton("Limpiar");
        limpiar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        limpiar.setBackground(new Color(149, 165, 166));
        limpiar.setForeground(Color.WHITE);
        limpiar.setFocusPainted(false);
        limpiar.setBorderPainted(false);
        limpiar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        limpiar.setBounds(235, 248, 200, 35);
        limpiar.addActionListener(this);
 
        JLabel lblSalida = new JLabel("Salida del programa:");
        lblSalida.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lblSalida.setForeground(new Color(44, 62, 80));
        lblSalida.setBounds(20, 295, 400, 20);
 
        areaSalida = new JTextPane();
        areaSalida.setFont(new Font("Consolas", Font.PLAIN, 13));
        areaSalida.setEditable(false);
        areaSalida.setBackground(new Color(30, 39, 46));
        areaSalida.setBorder(new EmptyBorder(10, 10, 10, 10));
 
        JScrollPane scroll = new JScrollPane(areaSalida);
        scroll.setBorder(BorderFactory.createLineBorder(new Color(30, 39, 46), 2));
        scroll.setBounds(20, 318, 415, 215);
 
        contenedor.add(lblTitulo);
        contenedor.add(panelDatos);
        contenedor.add(ejecutar);
        contenedor.add(limpiar);
        contenedor.add(lblSalida);
        contenedor.add(scroll);
    }
 
    private void agregarLineaColoreada(String linea) {
        Color color;
        boolean negrita = false;
 
        if (linea.contains("try")) {
            color = COLOR_TRY;
        } else if (linea.contains("finally")) {
            color = COLOR_FINALLY;
        } else if (linea.contains("excepcion") || linea.contains("cero")) {
            color = COLOR_ERROR;
            negrita = true;
        } else if (linea.contains("Resultado") || linea.contains("Imprimiendo")) {
            color = COLOR_OK;
            negrita = true;
        } else {
            color = COLOR_DEFAULT;
        }
 
        StyledDocument doc = areaSalida.getStyledDocument();
        Style estilo = areaSalida.addStyle("estilo", null);
        StyleConstants.setForeground(estilo, color);
        StyleConstants.setBold(estilo, negrita);
        StyleConstants.setFontFamily(estilo, "Consolas");
        StyleConstants.setFontSize(estilo, 13);
 
        try {
            String prefijo;
            if (linea.contains("try"))          prefijo = "▶  ";
            else if (linea.contains("finally")) prefijo = "◆  ";
            else if (linea.contains("excepcion") || linea.contains("cero")) prefijo = "✖  ";
            else if (linea.contains("Resultado") || linea.contains("Imprimiendo")) prefijo = "✔  ";
            else prefijo = "   ";
 
            doc.insertString(doc.getLength(), prefijo + linea + "\n", estilo);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }
 
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == ejecutar) {
            try {
                int dividendo = Integer.parseInt(campoDividendo.getText().trim());
                int divisor = Integer.parseInt(campoDivisor.getText().trim());
                boolean usarObjetoNulo = chkObjetoNulo.isSelected();
                String textoObjeto = campoObjeto.getText();
 
                PruebaExcepciones prueba = new PruebaExcepciones();
                String salida = prueba.ejecutar(dividendo, divisor, usarObjetoNulo, textoObjeto);
                areaSalida.setText("");
                for (String linea : salida.split("\n")) {
                    agregarLineaColoreada(linea);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "El dividendo y el divisor deben ser numeros enteros.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (evento.getSource() == limpiar) {
            campoDividendo.setText("");
            campoDivisor.setText("");
            campoObjeto.setText("");
            areaSalida.setText("");
        }
    }
}