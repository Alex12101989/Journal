package com.company;

import java.util.ArrayList;

public class Department {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addStudent(String name, String lastName) {
        students.add(new Student(name, lastName));
    }

    public void addStudent(Student student) {
        students.add(student);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentsCount() {
        return students.size();
    }

    public  Student getStudent(String lastName) {
        for (Student student : students) {
            if (student.getLastName().equals(lastName))
                return student;

        }
        throw new DataNotFoundExeption("Student " + lastName + " not found");

    }

    public double getAverageBySubj(String subj) {
        if (students.isEmpty()) throw new JournalEmptyExeption("Deparment is empty");


        double sum = 0;

        for (Student student : students) {
            sum += student.getAverageMark(subj);
        }

        return sum / getStudentsCount();
    }


}
