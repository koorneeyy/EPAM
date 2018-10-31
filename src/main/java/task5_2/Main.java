package task5_2;

import java.util.*;

public class Main {

    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter  range : ");
        int range = in.nextInt();
        System.out.print("Enter count numbers: ");
        int size = in.nextInt();

        for(int element = 0; element < size; element++){
            int rndNum = (int) (Math.random()*range);
            set.add(rndNum);
            list.add(rndNum);
        }
        System.out.println("Set: " + set);
        System.out.println("List: " + list);
    }
}
