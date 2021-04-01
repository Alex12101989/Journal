package com.company;

public class DataNotFoundExeption extends IndexOutOfBoundsException{
    public DataNotFoundExeption(String s) {
        super(s);
    }
}
