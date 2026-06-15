/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio68pagina427;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Josep
 */
public class VentanaPrincipal extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel lblTitulo, lblRuta;
    private JTextField campoRuta;
    private JButton examinar, leer, limpiar;
    private JTextArea areaContenido;

    public VentanaPrincipal() {
        inicio();
        setTitle("Lectura de Archivos");
        setSize(540, 460);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(245, 247, 250));

        lblTitulo = new JLabel("Lectura de Archivos de Texto");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitulo.setForeground(new Color(44, 62, 80));
        lblTitulo.setBounds(20, 20, 500, 30);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

        lblRuta = new JLabel("Archivo:");
        lblRuta.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblRuta.setForeground(new Color(60, 60, 60));
        lblRuta.setBounds(25, 65, 60, 25);

        campoRuta = new JTextField();
        campoRuta.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campoRuta.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                new EmptyBorder(2, 5, 2, 5)));
        campoRuta.setBounds(85, 65, 305, 25);

        examinar = new JButton("Examinar...");
        examinar.setFont(new Font("Segoe UI", Font.BOLD, 12));
        examinar.setBackground(new Color(149, 165, 166));
        examinar.setForeground(Color.WHITE);
        examinar.setFocusPainted(false);
        examinar.setBorderPainted(false);
        examinar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        examinar.setBounds(400, 65, 115, 25);
        examinar.addActionListener(this);

        leer = new JButton("Leer archivo");
        leer.setFont(new Font("Segoe UI", Font.BOLD, 13));
        leer.setBackground(new Color(52, 152, 219));
        leer.setForeground(Color.WHITE);
        leer.setFocusPainted(false);
        leer.setBorderPainted(false);
        leer.setCursor(new Cursor(Cursor.HAND_CURSOR));
        leer.setBounds(85, 105, 200, 35);
        leer.addActionListener(this);

        limpiar = new JButton("Limpiar");
        limpiar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        limpiar.setBackground(new Color(149, 165, 166));
        limpiar.setForeground(Color.WHITE);
        limpiar.setFocusPainted(false);
        limpiar.setBorderPainted(false);
        limpiar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        limpiar.setBounds(315, 105, 200, 35);
        limpiar.addActionListener(this);

        JLabel lblContenido = new JLabel("Contenido del archivo:");
        lblContenido.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lblContenido.setForeground(new Color(44, 62, 80));
        lblContenido.setBounds(25, 155, 300, 20);

        areaContenido = new JTextArea();
        areaContenido.setFont(new Font("Consolas", Font.PLAIN, 13));
        areaContenido.setEditable(false);
        areaContenido.setForeground(new Color(44, 62, 80));
        areaContenido.setBorder(new EmptyBorder(8, 8, 8, 8));
        JScrollPane scroll = new JScrollPane(areaContenido);
        scroll.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        scroll.setBounds(25, 180, 490, 230);

        contenedor.add(lblTitulo);
        contenedor.add(lblRuta);
        contenedor.add(campoRuta);
        contenedor.add(examinar);
        contenedor.add(leer);
        contenedor.add(limpiar);
        contenedor.add(lblContenido);
        contenedor.add(scroll);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == examinar) {
            JFileChooser selector = new JFileChooser();
            selector.setDialogTitle("Seleccione un archivo de texto");
            int opcion = selector.showOpenDialog(this);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                campoRuta.setText(selector.getSelectedFile().getAbsolutePath());
            }
        }

        if (evento.getSource() == leer) {
            String ruta = campoRuta.getText().trim();
            if (ruta.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Debe indicar la ruta del archivo.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            LeerArchivo lector = new LeerArchivo();
            try {
                areaContenido.setText(lector.leer(ruta));
            } catch (IOException e) {
                // En caso que se genere una excepcion de E/S
                areaContenido.setText("");
                JOptionPane.showMessageDialog(null,
                        "No se pudo leer el archivo.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (evento.getSource() == limpiar) {
            campoRuta.setText("");
            areaContenido.setText("");
        }
    }
}

