/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */

public class TextCourse extends Course {

    private int read;
    private int total;

    public TextCourse(String id, String name, String instructor, double duration,
                      int read, int total) {
        super(id, name, instructor, duration);
        this.read = read;
        this.total = total;
    }

    @Override
    public double getProgress() {
        if (total == 0) return 0;
        return (read * 100.0) / total;
    }
}