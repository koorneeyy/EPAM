package task1_4.view;


public class MatrixView {
    public static final String INPUT_INT_DATA = "Enter matrix dim (an integer) = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String MATRIX_ORIGINAL = "Matrix original: \n";
    public static final String MATRIX_ROTATED = "Matrix rotated: \n";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printMessageAndResult(String message, String value) {
        System.out.println(message + value);
    }
}
