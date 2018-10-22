package task3_2.view;

import task3_2.model.entity.Goods;

import java.util.List;
import java.util.Set;

public class ShopView {
    public static final String MENU ="Show all departments                   -       press 1\n" +
                    "Create department                      -       press 2\n" +
                    "Delete a department                    -       press 3\n" +
                    "Supply of goods                        -       press 4\n" +
                    "Show goods                             -       press 5\n" +
                    "Add location                           -       press 6\n" +
                    "Delete a location                      -       press 7\n" +
                    "Show locations                         -       press 8\n" +
                    "Reallocation of departments(sort)      -       press 9\n" +
                    "Exit                                   -       press 0\n>>";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input. Repeat please.";
    public static final String ALL_LOC ="All locations:" ;

    public void printMessage(String s) {
        System.out.println(s);
        System.out.println();
    }

    public void printListOfDepartments(String message, List listOfDepartments) {
        System.out.println(message);
        for (Object listOfDepartment : listOfDepartments) {
            System.out.println(listOfDepartment);
        }
        System.out.println();
    }

    public void printMessageWithoutLn(String s) {
        System.out.print(s);
    }

    public void printListOfGoods(List<Goods> goodsOfDepartment) {
        goodsOfDepartment.forEach(System.out::println);
        System.out.println();
    }

    public void printListOfLocations(Set<Integer> listOfLocation) {
        listOfLocation.forEach(System.out::println);
        System.out.println();
    }
}
