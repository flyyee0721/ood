package jianye.ood.chapter10;

import java.util.List;
import java.util.LinkedList;

/**
 * Created by jianye on 3/12/17.
 */
/*
 * Everything thing is an object
 * Every object has attributes and actions, attributes are translated into data fields and actions are translated into methods.
 *
 */
public class Course {
    private String courseName;
    private int capacity = 100;
    private List<Student> enrolledStudents;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        enrolledStudents = new LinkedList<Student>();
    }

    public void addStudent(String student) {
        synchronized (this) {
            if (enrolledStudents.size() == capacity) {
                throw new RuntimeException("Class is full");
            }
            enrolledStudents.add(new Student(student));
        }
    }

    public boolean dropStudent(String name) {
        synchronized (this) {
            for (int i = 0; i < enrolledStudents.size(); i++) {
                if (name.equals(enrolledStudents.get(i).getName())) {
                    enrolledStudents.remove(i);
                    return true;
                }
            }
            return false;
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public final List<Student> getStudents() {
        return enrolledStudents;
    }

    public int getNumberOfStudents() {
        return enrolledStudents.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course " + courseName + " has following students: \n");
        for (Student student : enrolledStudents) {
            sb.append(student.toString() + "\n");
        }
        return sb.toString();
    }
}

