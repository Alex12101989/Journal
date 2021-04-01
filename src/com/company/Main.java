package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student st1 = new Student("Ivan", "Ivanov");
        st1.addMark("Мат", 4);
        st1.addMark("Мат", 3);
        st1.addMark("Мат", 5);
        st1.addMark("Рус", 4);
        System.out.println(st1.getAverageMark("Мат"));

        Journal j1 = new Journal();
        j1.addDeparment("g1");
        j1.addDeparment("g2");

        j1.getDepartment("g1").addStudent(st1);
        j1.getDepartment("g1").addStudent("Petr", "Petrov");
        j1.getDepartment("g1").getStudent("Petrov").addMark("Мат", 5);
        j1.getDepartment("g1").getStudent("Petrov").addMark("Мат", 2);
        j1.getDepartment("g1").getStudent("Petrov").addMark("Мат", 2);
        j1.getDepartment("g1").getStudent("Petrov").addMark("Рус", 1);

        System.out.println(j1.getDepartment("g1").getStudent("Petrov").getAverageMark("Мат"));

        System.out.println(j1.getDepartment("g1").getAverageBySubj("Физ"));




    }
}
