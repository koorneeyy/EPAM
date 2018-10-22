package task2_1.view;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(BooksView view) {
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    public static String inputString(BooksView view) {
        view.printMessage(view.INPUT_STRING_DATA);
        return sc.next();
    }
}