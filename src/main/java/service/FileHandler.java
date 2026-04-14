/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author LENOVO
 */


import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public void saveData(String data) {
        try {
            FileWriter fw = new FileWriter("data.txt", true);
            fw.write(data + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving file");
        }
    }
}