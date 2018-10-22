package com.epam.view;


public class CalculateView {
    public static final String INPUT_INT_DATA =
            "Enter an integer = ";
    public static final String WRONG_INPUT_INT_DATA =

"Wrong input! Repeat please! ";
    public static final String OUR_INT = "Increment result = ";
    public void printMessage(String message) {
        System.out.print(message);
    }
    public void printMessageAndResult(String message, int value) {
        System.out.println(message + value);
    }
}