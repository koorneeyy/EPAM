package task1_3.view;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(PyramidView view) {
        int result=0;
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        result=sc.nextInt();
        if(result>9 ||result<1){
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return result;
    }
}