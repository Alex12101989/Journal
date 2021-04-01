package com.company;

import java.util.ArrayList;

public class Journal {
    ArrayList<Department> depts = new ArrayList<>();

    public void addDeparment(String name){
        depts.add(new Department(name));
    }


    public Department getDepartment(String name) {
        for (Department dept: depts) {
            if (dept.getName().equals(name))
                return dept;

        }
        throw new DataNotFoundExeption("Department " + name + " not found");
    }
}
