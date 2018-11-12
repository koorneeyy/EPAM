package task7_6;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("qwe");
        List<Integer> integerList=Stream.iterate(10,n->n+10)
                .limit(10)
                .map(n->n/2).collect(Collectors.toList());

        System.out.println(integerList);

    }


    public List<Person> createList(){

        return Arrays.asList(
                new Person("Oleg", 22,Person.sex.MALE)
        );
    }
}
