package task5_1;


import java.util.Scanner;

public class InputUtility {
    public static final String MENU="1. add student \n2. show all students \n3. exit ";
    private static Scanner sc = new Scanner(System.in);
    public static String inputIntValueWithScanner() {
        return sc.nextLine();
    }
}
