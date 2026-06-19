/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formulario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Josep
 */
public class Friends {
 
    public static final String FILE_NAME = "friendsContact.txt";
 
    public static final String SEPARATOR = "!";
 
    private String name;
    private String number;
 
    public Friends() {
    }
 
    public Friends(String name, String number) {
        this.name = name;
        this.number = number;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getNumber() {
        return number;
    }
 
    public void setNumber(String number) {
        this.number = number;
    }
 
    public boolean create() throws IOException {
        if (exists(this.name)) {
            return false;
        }
 
        try (BufferedWriter writer =
                 new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(this.name + SEPARATOR + this.number);
            writer.newLine();
        }
        return true;
    }
    
    public static ArrayList<Friends> read() throws IOException {
        ArrayList<Friends> list = new ArrayList<>();
        File file = new File(FILE_NAME);
 
        if (!file.exists()) {
            return list;
        }
 
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(SEPARATOR, 2);
                    if (parts.length == 2) {
                        list.add(new Friends(parts[0], parts[1]));
                    }
                }
            }
        }
        return list;
    }
 
    public boolean update() throws IOException {
        ArrayList<Friends> list = read();
        boolean found = false;
 
        for (Friends f : list) {
            if (f.getName().equalsIgnoreCase(this.name)) {
                f.setNumber(this.number);
                found = true;
                break;
            }
        }
 
        if (found) {
            writeAll(list);
        }
        return found;
    }
 
    public boolean delete() throws IOException {
        ArrayList<Friends> list = read();
        boolean found = false;
 
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equalsIgnoreCase(this.name)) {
                list.remove(i);
                found = true;
                break;
            }
        }
 
        if (found) {
            writeAll(list);
        }
        return found;
    }

    public static boolean exists(String name) throws IOException {
        for (Friends f : read()) {
            if (f.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
 
    private static void writeAll(ArrayList<Friends> list) throws IOException {
        try (BufferedWriter writer =
                 new BufferedWriter(new FileWriter(FILE_NAME, false))) {
            for (Friends f : list) {
                writer.write(f.getName() + SEPARATOR + f.getNumber());
                writer.newLine();
            }
        }
    }
}
