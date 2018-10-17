package task3_1;


import task3_1.data.DataSource;
import task3_1.model.entity.BaseToy;
import task3_1.model.entity.ToyRoom;

public class Main {
    public static void main(String[] args) {

        ToyRoom<BaseToy> toyToyRoom=new ToyRoom<>();
        toyToyRoom.setToys(DataSource.getToys());
        System.out.println(toyToyRoom.getTotalPrice());
        System.out.println(toyToyRoom.getToysByAge(6).length);
       // Enum
    }
}
