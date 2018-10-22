package task1_3.view;

public class PyramidView {
    public static final String INPUT_INT_DATA = "Enter an integer (1-9) = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String RESULT = "Result: \n";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printMessageAndResult(String message, String value) {
        System.out.println(message + value);
    }

}