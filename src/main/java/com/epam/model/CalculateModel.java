package com.epam.model;


public class CalculateModel {
    private int value;
    public int getValue() {
        return value;

    }
    public void setValue(int value) {
        this.value = value;
    }
    public void incrementValue() {
        ++value;
    }
}