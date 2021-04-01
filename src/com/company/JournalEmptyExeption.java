package com.company;

public class JournalEmptyExeption extends IllegalArgumentException{
    public JournalEmptyExeption(String s) {
        super(s);
    }
}
