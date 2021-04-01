package com.company;

import java.util.ArrayList;

public class Student {
    String name;
    String lastName;
    ArrayList <Mark> marks;



    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.marks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addMark (String subj, int mark){
        marks.add(new Mark(subj, mark));
    }

    public double getAverageMark(String subj){
        if(marks.isEmpty()) return 0;
        int sum=0;
        int n=0;
        for (Mark mark: marks) {
            if (subj.equals(mark.subj)){
            sum += mark.mark;
            n++;}
        }
        if (n == 0) throw new DataNotFoundExeption("Subject "+ subj + " not found" );
        return (double)sum / n;

    }
}
