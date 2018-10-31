package task5_3;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    private static final String MENU = "1. translate \n2. add word \n3. show dictionary \n4. exit ";
    static HashMap<String, String> dictionary = new HashMap<>();

    public static void main(String[] args) {
        dictionary.put("London", "Лондон");
        dictionary.put("is", "є");
        dictionary.put("the", " ");
        dictionary.put("capital", "столиця");
        dictionary.put("of", "у");
        dictionary.put("GB", "Великобританія");

        while (true) {
            System.out.println(MENU);
            String s = sc.nextLine();
            switch (s) {
                case "1":
                    System.out.println(translate(sc.nextLine()));
                    break;
                case "2":
                    System.out.println("Enter english ukrainian phrase separated by space 'Country країна'");
                    addWord(sc.nextLine());
                    break;
                case "3":
                    showDic();
                    break;
                case "4":
                    System.exit(0);
                    break;
           }
        }
    }

    private static void addWord(String s) {
        String[] split = s.split(" ");
        if (split.length == 2) {
            dictionary.put(split[0], split[1]);
        } else {
            System.out.println("incorrect input");
        }

    }

    private static void showDic() {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry);
        }
    }

    private static String translate(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            sb.append(dictionary.get(word) + " ");
        }
        return sb.toString();
    }
}
