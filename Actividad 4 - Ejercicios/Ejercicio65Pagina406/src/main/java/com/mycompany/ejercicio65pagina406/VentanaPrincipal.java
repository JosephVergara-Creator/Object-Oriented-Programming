/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio65pagina406;

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
    private JLabel lblTitulo, lblNombre, lblApellidos, lblEdad;
    private JTextField campoNombre, campoApellidos, campoEdad;
    private JButton verificar, limpiar;
    private JPanel panelDatos, panelResultado;
    private JTextArea areaResultado;

    public VentanaPrincipal() {
        inicio();
        setTitle("Registro de Vendedor");
        setSize(440, 430);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(245, 247, 250));

        lblTitulo = new JLabel("Registro de Vendedor");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitulo.setForeground(new Color(44, 62, 80));
        lblTitulo.setBounds(20, 20, 400, 30);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

        panelDatos = new JPanel(null);
        panelDatos.setBackground(Color.WHITE);
        panelDatos.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        panelDatos.setBounds(20, 65, 395, 160);

        JLabel lblEncabezado = new JLabel("Ingrese los datos del vendedor:");
        lblEncabezado.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblEncabezado.setForeground(new Color(100, 100, 100));
        lblEncabezado.setBounds(15, 10, 340, 20);

        lblNombre = new JLabel("Nombre:");
        lblApellidos = new JLabel("Apellidos:");
        lblEdad = new JLabel("Edad:");

        campoNombre = new JTextField();
        campoApellidos = new JTextField();
        campoEdad = new JTextField();

        JLabel[] etiquetas = {lblNombre, lblApellidos, lblEdad};
        JTextField[] campos = {campoNombre, campoApellidos, campoEdad};

        for (int i = 0; i < 3; i++) {
            etiquetas[i].setFont(new Font("Segoe UI", Font.PLAIN, 13));
            etiquetas[i].setForeground(new Color(60, 60, 60));
            etiquetas[i].setBounds(15, 40 + i * 35, 90, 23);
            campos[i].setFont(new Font("Segoe UI", Font.PLAIN, 13));
            campos[i].setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 200, 200)),
                    new EmptyBorder(2, 5, 2, 5)));
            campos[i].setBounds(110, 40 + i * 35, 265, 23);
            panelDatos.add(etiquetas[i]);
            panelDatos.add(campos[i]);
        }
        panelDatos.add(lblEncabezado);

        verificar = new JButton("Verificar");
        verificar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        verificar.setBackground(new Color(52, 152, 219));
        verificar.setForeground(Color.WHITE);
        verificar.setFocusPainted(false);
        verificar.setBorderPainted(false);
        verificar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        verificar.setBounds(20, 240, 185, 35);
        verificar.addActionListener(this);

        limpiar = new JButton("Limpiar");
        limpiar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        limpiar.setBackground(new Color(149, 165, 166));
        limpiar.setForeground(Color.WHITE);
        limpiar.setFocusPainted(false);
        limpiar.setBorderPainted(false);
        limpiar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        limpiar.setBounds(230, 240, 185, 35);
        limpiar.addActionListener(this);

        panelResultado = new JPanel(null);
        panelResultado.setBackground(Color.WHITE);
        panelResultado.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        panelResultado.setBounds(20, 290, 395, 100);

        JLabel lblResEncabezado = new JLabel("Resultado:");
        lblResEncabezado.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lblResEncabezado.setForeground(new Color(44, 62, 80));
        lblResEncabezado.setBounds(15, 8, 200, 20);

        areaResultado = new JTextArea();
        areaResultado.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        areaResultado.setEditable(false);
        areaResultado.setForeground(new Color(41, 128, 185));
        areaResultado.setBackground(Color.WHITE);
        areaResultado.setBounds(15, 30, 365, 62);

        panelResultado.add(lblResEncabezado);
        panelResultado.add(areaResultado);

        contenedor.add(lblTitulo);
        contenedor.add(panelDatos);
        contenedor.add(verificar);
        contenedor.add(limpiar);
        contenedor.add(panelResultado);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == verificar) {
            try {
                String nombre = campoNombre.getText().trim();
                String apellidos = campoApellidos.getText().trim();
                if (nombre.isEmpty() || apellidos.isEmpty()) {
                    throw new IllegalArgumentException("Debe ingresar nombre y apellidos.");
                }
                int edad = Integer.parseInt(campoEdad.getText().trim());

                Vendedor vendedor = new Vendedor(nombre, apellidos);
                vendedor.verificarEdad(edad);
                areaResultado.setForeground(new Color(39, 174, 96));
                areaResultado.setText(vendedor.imprimir());
            } catch (NumberFormatException e) {
                areaResultado.setForeground(new Color(192, 57, 43));
                areaResultado.setText("La edad debe ser un valor numerico entero.");
            } catch (IllegalArgumentException e) {
                areaResultado.setForeground(new Color(192, 57, 43));
                areaResultado.setText(e.getMessage());
            }
        }
        if (evento.getSource() == limpiar) {
            campoNombre.setText("");
            campoApellidos.setText("");
            campoEdad.setText("");
            areaResultado.setText("");
        }
    }
}

