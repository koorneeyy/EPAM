package task3_1.model;

import java.util.Arrays;
import java.util.Comparator;

public class ToyRoom <T extends BaseToy> {

    private T[] toys;

    public T[] getToys() {
        return this.toys;
    }

    public void setToys(T[] toys) {
        this.toys = toys;
    }

    public int getTotalPrice() {
        int prise = 0;
        for (T t : toys) prise += t.getPrice();
        return prise;
    }

    public int getToysCountInRoom() {
        int prise = 0;
        for (T t : toys) prise += t.getPrice();
        return prise;
    }

    public T[] getToysByAge(int age) {
        T[] temp = toys;
        int counter = 0;
        for (int i = 0; i < toys.length; i++) {
            if (toys[i].getChildAge() < age) {
                temp[counter++] = toys[i];
            } else temp[i] = null;
        }
        return Arrays.copyOf(temp, counter);
    }

    public  T[] orderByName(){
        Arrays.sort(toys, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return toys;
    }

}

