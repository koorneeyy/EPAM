package project1.utils;



import project1.view.AirView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(AirView view) {
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA );
            sc.next();
        }
        return sc.nextInt();
    }


}