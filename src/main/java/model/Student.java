/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */


import java.util.ArrayList;

public class Student {

    private String name;
    private String email;
    private String phone;
    private ArrayList<Course> courses;

    public Student(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        courses = new ArrayList<>();
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}