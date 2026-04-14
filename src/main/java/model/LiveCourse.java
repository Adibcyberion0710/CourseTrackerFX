/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */

public class LiveCourse extends Course {

    private int attended;
    private int total;

    public LiveCourse(String id, String name, String instructor, double duration,
                      int attended, int total) {
        super(id, name, instructor, duration);
        this.attended = attended;
        this.total = total;
    }

    @Override
    public double getProgress() {
        if (total == 0) return 0;
        return (attended * 100.0) / total;
    }
}