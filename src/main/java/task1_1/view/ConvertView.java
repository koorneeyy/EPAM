package task1_1.view;

public class ConvertView {
    public static final String INPUT_INT_DATA = "Enter an integer = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String INT = "Decimal representation is: ";
    public static final String BIN = "Binary representation is: ";
    public static final String OCTA = "Octa representation is: ";
    public static final String HEX = "HEX representation is: ";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printMessageAndResult(String message, String value) {
        System.out.println(message + value);
    }
}