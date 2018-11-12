package task7_1;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Runner  {
    public void run() throws NoSuchFieldException, IllegalAccessException {
        String string = "Hello";
//        Scanner sc =new Scanner(System.in);
//       String string = sc.nextLine();
        System.out.println(string);
        Class<String> clazz = String.class;
        Field field = clazz.getDeclaredField("value");
        field.setAccessible(true);
        field.set(string,"hello22222".toCharArray());
        System.out.println(string);
        System.out.println("Hello");

    }
}
