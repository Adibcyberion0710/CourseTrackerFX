/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */


public class VideoCourse extends Course {

    private int watched;
    private int total;

    public VideoCourse(String id, String name, String instructor, double duration,
                       int watched, int total) {
        super(id, name, instructor, duration);
        this.watched = watched;
        this.total = total;
    }

    @Override
    public double getProgress() {
        if (total == 0) return 0;
        return (watched * 100.0) / total;
    }
}