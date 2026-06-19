/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formulario;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Josep
 */

public class Formulario extends JFrame {
 
    private JTextField nameField;
    private JTextField numberField;
    private JTextArea displayArea;
 
    public Formulario() {
        setTitle("Contact Manager - CRUD with File");
        setSize(520, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
 
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Contact Data"));
 
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
 
        inputPanel.add(new JLabel("Number:"));
        numberField = new JTextField();
        inputPanel.add(numberField);
 
        add(inputPanel, BorderLayout.NORTH);
 
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Contacts"));
        add(scrollPane, BorderLayout.CENTER);
 
        JPanel buttonPanel = new JPanel(new FlowLayout());
 
        JButton createButton = new JButton("Create");
        JButton readButton   = new JButton("Read");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        JButton clearButton  = new JButton("Clear");
        JButton closeButton  = new JButton("Close");
 
        buttonPanel.add(createButton);
        buttonPanel.add(readButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(closeButton);
 
        add(buttonPanel, BorderLayout.SOUTH);
 
        createButton.addActionListener(e -> createContact());
        readButton.addActionListener(e -> readContacts());
        updateButton.addActionListener(e -> updateContact());
        deleteButton.addActionListener(e -> deleteContact());
        clearButton.addActionListener(e -> clearFields());
        closeButton.addActionListener(e -> System.exit(0));
    }

    private void createContact() {
        String name = nameField.getText().trim();
        String number = numberField.getText().trim();
 
        if (name.isEmpty() || number.isEmpty()) {
            showWarning("Please enter both name and number.");
            return;
        }
        if (name.contains(Friends.SEPARATOR) || number.contains(Friends.SEPARATOR)) {
            showWarning("The character '!' cannot be used in the name or number.");
            return;
        }
 
        try {
            Friends friend = new Friends(name, number);
            if (friend.create()) {
                showMessage("Contact created successfully.");
                clearFields();
            } else {
                showWarning("A contact with that name already exists.");
            }
        } catch (IOException ex) {
            showError("Error writing to the file: " + ex.getMessage());
        }
    }
 
    private void readContacts() {
        try {
            ArrayList<Friends> contacts = Friends.read();
 
            if (contacts.isEmpty()) {
                displayArea.setText("No contacts found.");
                return;
            }
 
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%-20s %s%n", "NAME", "NUMBER"));
            sb.append("----------------------------------------\n");
            for (Friends f : contacts) {
                sb.append(String.format("%-20s %s%n", f.getName(), f.getNumber()));
            }
            displayArea.setText(sb.toString());
        } catch (IOException ex) {
            showError("Error reading the file: " + ex.getMessage());
        }
    }
 
    private void updateContact() {
        String name = nameField.getText().trim();
        String number = numberField.getText().trim();
 
        if (name.isEmpty() || number.isEmpty()) {
            showWarning("Please enter the name and the new number.");
            return;
        }
        if (name.contains(Friends.SEPARATOR) || number.contains(Friends.SEPARATOR)) {
            showWarning("The character '!' cannot be used in the name or number.");
            return;
        }
 
        try {
            Friends friend = new Friends(name, number);
            if (friend.update()) {
                showMessage("Contact updated successfully.");
                clearFields();
            } else {
                showWarning("Contact not found.");
            }
        } catch (IOException ex) {
            showError("Error writing to the file: " + ex.getMessage());
        }
    }
 
    private void deleteContact() {
        String name = nameField.getText().trim();
 
        if (name.isEmpty()) {
            showWarning("Please enter the name of the contact to delete.");
            return;
        }
 
        try {
            Friends friend = new Friends(name, null);
            if (friend.delete()) {
                showMessage("Contact deleted successfully.");
                clearFields();
            } else {
                showWarning("Contact not found.");
            }
        } catch (IOException ex) {
            showError("Error writing to the file: " + ex.getMessage());
        }
    }
 
    private void clearFields() {
        nameField.setText("");
        numberField.setText("");
        displayArea.setText("");
    }
 
    private void showMessage(String text) {
        JOptionPane.showMessageDialog(this, text, "Information",
                JOptionPane.INFORMATION_MESSAGE);
    }
 
    private void showWarning(String text) {
        JOptionPane.showMessageDialog(this, text, "Warning",
                JOptionPane.WARNING_MESSAGE);
    }
 
    private void showError(String text) {
        JOptionPane.showMessageDialog(this, text, "Error",
                JOptionPane.ERROR_MESSAGE);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Formulario app = new Formulario();
            app.setVisible(true);
        });
    }
}
