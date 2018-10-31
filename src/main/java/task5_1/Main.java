package task5_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Student> list = new ArrayList<>();

    public static void main(String[] args) {


        while (true) {
            System.out.println(InputUtility.MENU);
            String s = InputUtility.inputIntValueWithScanner();
            switch (s) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    list.forEach(item -> System.out.println(item));
                    break;
                case "3":
                    System.exit(0);
                    break;

            }
        }
    }

    private static void addStudent() {
        String name;
        String surName;
        String birthday;
        String phone;
        String adress;
        System.out.println("Enter name");
        do { name = InputUtility.inputIntValueWithScanner();        }
        while (!InputValidator.validate(name, InputValidator.NAME_REGEX));

        System.out.println("Enter surname");
        do { surName = InputUtility.inputIntValueWithScanner();        }
        while (!InputValidator.validate(surName, InputValidator.SURNAME_REGEX));

        System.out.println("Enter birthday");
        do { birthday = InputUtility.inputIntValueWithScanner();        }
        while (!InputValidator.validate(birthday, InputValidator.BIRTHDAY_REGEX));

        System.out.println("Enter phone");
        do { phone = InputUtility.inputIntValueWithScanner();        }
        while (!InputValidator.validate(phone, InputValidator.PHONE_REGEX));

        System.out.println("Enter adress");
        do { adress = InputUtility.inputIntValueWithScanner();        }
        while (!InputValidator.validate(adress, InputValidator.ADRESS_REGEX));
        list.add(new Student(name,surName,birthday,phone,adress));
    }
}
