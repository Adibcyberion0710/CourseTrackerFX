/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author LENOVO
 */


import model.Course;
import java.util.ArrayList;

public class CourseManager {

    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Course c) {
        courses.add(c);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}