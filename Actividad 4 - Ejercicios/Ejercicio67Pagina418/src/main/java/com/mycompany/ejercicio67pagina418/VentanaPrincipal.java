/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio67pagina418;

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
    private JLabel lblTitulo, lblNombreEquipo, lblUniversidad, lblLenguaje,
            lblNombreProg, lblApellidosProg;
    private JTextField campoNombreEquipo, campoUniversidad, campoLenguaje,
            campoNombreProg, campoApellidosProg;
    private JButton crearEquipo, anadir;
    private JTextArea areaEquipo;

    private EquipoMaratonProgramacion equipo;

    public VentanaPrincipal() {
        inicio();
        setTitle("Equipo Maraton de Programacion");
        setSize(470, 560);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(245, 247, 250));

        lblTitulo = new JLabel("Equipo Maraton de Programacion");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 17));
        lblTitulo.setForeground(new Color(44, 62, 80));
        lblTitulo.setBounds(20, 15, 430, 30);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelEquipo = new JPanel(null);
        panelEquipo.setBackground(Color.WHITE);
        panelEquipo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        panelEquipo.setBounds(20, 55, 425, 150);

        JLabel lblEnc1 = new JLabel("Datos del equipo:");
        lblEnc1.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lblEnc1.setForeground(new Color(44, 62, 80));
        lblEnc1.setBounds(15, 8, 200, 20);

        lblNombreEquipo = new JLabel("Nombre equipo:");
        lblUniversidad = new JLabel("Universidad:");
        lblLenguaje = new JLabel("Lenguaje:");
        campoNombreEquipo = new JTextField();
        campoUniversidad = new JTextField();
        campoLenguaje = new JTextField();

        JLabel[] et1 = {lblNombreEquipo, lblUniversidad, lblLenguaje};
        JTextField[] cp1 = {campoNombreEquipo, campoUniversidad, campoLenguaje};
        for (int i = 0; i < 3; i++) {
            et1[i].setFont(new Font("Segoe UI", Font.PLAIN, 13));
            et1[i].setForeground(new Color(60, 60, 60));
            et1[i].setBounds(15, 38 + i * 33, 110, 23);
            cp1[i].setFont(new Font("Segoe UI", Font.PLAIN, 13));
            cp1[i].setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 200, 200)),
                    new EmptyBorder(2, 5, 2, 5)));
            cp1[i].setBounds(130, 38 + i * 33, 275, 23);
            panelEquipo.add(et1[i]);
            panelEquipo.add(cp1[i]);
        }
        panelEquipo.add(lblEnc1);

        crearEquipo = new JButton("Crear equipo");
        crearEquipo.setFont(new Font("Segoe UI", Font.BOLD, 13));
        crearEquipo.setBackground(new Color(52, 152, 219));
        crearEquipo.setForeground(Color.WHITE);
        crearEquipo.setFocusPainted(false);
        crearEquipo.setBorderPainted(false);
        crearEquipo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        crearEquipo.setBounds(20, 215, 425, 33);
        crearEquipo.addActionListener(this);

        JPanel panelProg = new JPanel(null);
        panelProg.setBackground(Color.WHITE);
        panelProg.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        panelProg.setBounds(20, 258, 425, 120);

        JLabel lblEnc2 = new JLabel("Anadir integrante (maximo 3):");
        lblEnc2.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lblEnc2.setForeground(new Color(44, 62, 80));
        lblEnc2.setBounds(15, 8, 300, 20);

        lblNombreProg = new JLabel("Nombre:");
        lblApellidosProg = new JLabel("Apellidos:");
        campoNombreProg = new JTextField();
        campoApellidosProg = new JTextField();

        JLabel[] et2 = {lblNombreProg, lblApellidosProg};
        JTextField[] cp2 = {campoNombreProg, campoApellidosProg};
        for (int i = 0; i < 2; i++) {
            et2[i].setFont(new Font("Segoe UI", Font.PLAIN, 13));
            et2[i].setForeground(new Color(60, 60, 60));
            et2[i].setBounds(15, 38 + i * 33, 90, 23);
            cp2[i].setFont(new Font("Segoe UI", Font.PLAIN, 13));
            cp2[i].setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 200, 200)),
                    new EmptyBorder(2, 5, 2, 5)));
            cp2[i].setBounds(110, 38 + i * 33, 295, 23);
            panelProg.add(et2[i]);
            panelProg.add(cp2[i]);
        }
        panelProg.add(lblEnc2);

        anadir = new JButton("Anadir programador");
        anadir.setFont(new Font("Segoe UI", Font.BOLD, 13));
        anadir.setBackground(new Color(46, 204, 113));
        anadir.setForeground(Color.WHITE);
        anadir.setFocusPainted(false);
        anadir.setBorderPainted(false);
        anadir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        anadir.setBounds(20, 388, 425, 33);
        anadir.addActionListener(this);

        areaEquipo = new JTextArea();
        areaEquipo.setFont(new Font("Consolas", Font.PLAIN, 13));
        areaEquipo.setEditable(false);
        areaEquipo.setForeground(new Color(44, 62, 80));
        areaEquipo.setBorder(new EmptyBorder(8, 8, 8, 8));
        JScrollPane scroll = new JScrollPane(areaEquipo);
        scroll.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        scroll.setBounds(20, 431, 425, 90);

        contenedor.add(lblTitulo);
        contenedor.add(panelEquipo);
        contenedor.add(crearEquipo);
        contenedor.add(panelProg);
        contenedor.add(anadir);
        contenedor.add(scroll);
    }

    private void actualizarVista() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo: ").append(equipo.getNombreEquipo())
                .append("  |  Universidad: ").append(equipo.getUniversidad())
                .append("  |  Lenguaje: ").append(equipo.getLenguajeProgramacion())
                .append("\nIntegrantes (").append(equipo.getTamanoEquipo()).append("/3):\n");
        Programador[] progs = equipo.getProgramadores();
        for (int i = 0; i < equipo.getTamanoEquipo(); i++) {
            sb.append("  ").append(i + 1).append(". ")
                    .append(progs[i].getNombre()).append(" ")
                    .append(progs[i].getApellidos()).append("\n");
        }
        areaEquipo.setText(sb.toString());
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == crearEquipo) {
            String nombre = campoNombreEquipo.getText().trim();
            String universidad = campoUniversidad.getText().trim();
            String lenguaje = campoLenguaje.getText().trim();
            if (nombre.isEmpty() || universidad.isEmpty() || lenguaje.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Debe ingresar el nombre, la universidad y el lenguaje del equipo.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            equipo = new EquipoMaratonProgramacion(nombre, universidad, lenguaje);
            actualizarVista();
            JOptionPane.showMessageDialog(null,
                    "Equipo creado. Ahora puede anadir hasta 3 integrantes.",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }

        if (evento.getSource() == anadir) {
            if (equipo == null) {
                JOptionPane.showMessageDialog(null,
                        "Primero debe crear el equipo.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                String nombre = campoNombreProg.getText().trim();
                String apellidos = campoApellidosProg.getText().trim();
                if (nombre.isEmpty() || apellidos.isEmpty()) {
                    throw new Exception("Debe ingresar nombre y apellidos del integrante.");
                }
                EquipoMaratonProgramacion.validarCampo(nombre);
                EquipoMaratonProgramacion.validarCampo(apellidos);
                Programador programador = new Programador(nombre, apellidos);
                equipo.anadir(programador);
                actualizarVista();
                campoNombreProg.setText("");
                campoApellidosProg.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
