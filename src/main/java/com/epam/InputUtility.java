package com.epam;

import com.epam.view.CalculateView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(
            CalculateView view) {

        view.printMessage(view.INPUT_INT_DATA);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA +
                    view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}