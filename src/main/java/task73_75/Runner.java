package task73_75;

import java.util.*;
import java.util.List;
import java.util.function.Predicate;

public class Runner {
    public void run() {
        Integer[] arrayInt = createArrayInt(22);
        System.out.println("Array: " + Arrays.toString(arrayInt));
//     Arrays.sort(arrayInt,((o1, o2) -> o2.compareTo(o1)));
        Arrays.sort(arrayInt, Comparator.reverseOrder());
        System.out.println("Array: " + Arrays.toString(arrayInt));


        List<String> listStr = createListStr();
        System.out.println("List: " + listStr);
        Collections.sort(listStr, Comparator.reverseOrder());
        System.out.println("List: " + listStr);
        //7_4
        System.out.println("--------------");
        System.out.println("sum= " + sum(arrayInt, x -> x % 2 == 0));
        System.out.println("--------------");
        System.out.println(selectString(listStr, x -> x.startsWith("p") || x.startsWith("f")));
        //7_4
        System.out.println("--------------");
        System.out.println("old list"+listStr);
        updateString(listStr,str -> str.toUpperCase());
        System.out.println("new list"+listStr);

        List<String> listNull = Arrays.asList("", null, "  ");
        updateString(listNull,str -> str.toUpperCase());
        System.out.println(listNull);


    }

    private Integer[] createArrayInt(int size) {
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private List<String> createListStr() {
        List<String> list = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            list.add("" + ch + ch);
//            list.add(String.valueOf(ch));
        }
        Collections.shuffle(list);
        return list;
    }


    public int sum(Integer[] array, Predicate<Integer> filter) {
        int ss = 0;
        for (Integer value : array) {
            if (filter.test(value)) ss += value;
        }
        return ss;
    }

    public List<String> selectString(List<String> list, Predicate<String> filter) {
        List<String> result = new ArrayList<>();

        for (String string : list) {
            if (filter.test(string)) result.add(string);
        }
        return result;
    }

    public void updateString(List<String> list,ConvertString convertString){
        for (int i=0;i<list.size();i++){
            if(!convertString.isEmpty(list.get(1))){
                list.set(i,convertString.convert(list.get(i)));
            }
        }
    }
}
