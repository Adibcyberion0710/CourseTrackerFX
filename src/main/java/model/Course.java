/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Course {
    protected String courseId;
    protected String courseName;
    protected String instructor;
    protected double duration;

    public Course(String id, String name, String instructor, double duration) {
        this.courseId = id;
        this.courseName = name;
        this.instructor = instructor;
        this.duration = duration;
    }

    public double getProgress() {
        return 0;
    }

    public String getCourseName() {
        return courseName;
    }
}