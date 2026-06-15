/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio66pagina412;

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
    private JLabel lblTitulo, lblValor, lblLogaritmo, lblRaiz;
    private JTextField campoValor;
    private JButton calcular, limpiar;
    private JPanel panelResultados;

    public VentanaPrincipal() {
        inicio();
        setTitle("Calculos Numericos");
        setSize(430, 330);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(245, 247, 250));

        lblTitulo = new JLabel("Calculos Numericos");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitulo.setForeground(new Color(44, 62, 80));
        lblTitulo.setBounds(20, 20, 390, 30);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

        lblValor = new JLabel("Valor numerico:");
        lblValor.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblValor.setForeground(new Color(60, 60, 60));
        lblValor.setBounds(30, 70, 110, 25);

        campoValor = new JTextField();
        campoValor.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campoValor.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                new EmptyBorder(2, 5, 2, 5)));
        campoValor.setBounds(145, 70, 250, 25);

        calcular = new JButton("Calcular");
        calcular.setFont(new Font("Segoe UI", Font.BOLD, 13));
        calcular.setBackground(new Color(52, 152, 219));
        calcular.setForeground(Color.WHITE);
        calcular.setFocusPainted(false);
        calcular.setBorderPainted(false);
        calcular.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calcular.setBounds(30, 110, 178, 35);
        calcular.addActionListener(this);

        limpiar = new JButton("Limpiar");
        limpiar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        limpiar.setBackground(new Color(149, 165, 166));
        limpiar.setForeground(Color.WHITE);
        limpiar.setFocusPainted(false);
        limpiar.setBorderPainted(false);
        limpiar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        limpiar.setBounds(217, 110, 178, 35);
        limpiar.addActionListener(this);

        panelResultados = new JPanel(null);
        panelResultados.setBackground(Color.WHITE);
        panelResultados.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        panelResultados.setBounds(30, 160, 365, 120);

        JLabel lblResEncabezado = new JLabel("Resultados:");
        lblResEncabezado.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lblResEncabezado.setForeground(new Color(44, 62, 80));
        lblResEncabezado.setBounds(15, 10, 200, 20);

        lblLogaritmo = new JLabel("-");
        lblLogaritmo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblLogaritmo.setForeground(new Color(41, 128, 185));
        lblLogaritmo.setBounds(15, 45, 340, 20);

        lblRaiz = new JLabel("-");
        lblRaiz.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblRaiz.setForeground(new Color(41, 128, 185));
        lblRaiz.setBounds(15, 80, 340, 20);

        panelResultados.add(lblResEncabezado);
        panelResultados.add(lblLogaritmo);
        panelResultados.add(lblRaiz);

        contenedor.add(lblTitulo);
        contenedor.add(lblValor);
        contenedor.add(campoValor);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(panelResultados);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            try {
                double valor = Double.parseDouble(campoValor.getText().trim());
                lblLogaritmo.setText(CalculosNumericos.calcularLogaritmoNeperiano(valor));
                lblRaiz.setText(CalculosNumericos.calcularRaizCuadrada(valor));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "El valor debe ser numerico.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (evento.getSource() == limpiar) {
            campoValor.setText("");
            lblLogaritmo.setText("-");
            lblRaiz.setText("-");
        }
    }
}
