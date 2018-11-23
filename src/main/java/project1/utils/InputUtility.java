package project1.utils;



import project1.view.AirView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(AirView view) {
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA );
            sc.next();
        }
        return sc.nextInt();
    }

    public static float inputFloat(AirView view) {
        view.printMessage(view.ENTER_FLOAT );
        while (!sc.hasNextFloat()) {
            view.printMessage(view.WRONG_INPUT_FLOAT_DATA );
            sc.next();
        }
        return sc.nextInt();
    }


    public static void inputString(AirView view) {
         String text = sc.next();
    }
}