package task3_1.data;

import task3_1.model.entity.ShipToy;
import task3_1.model.entity.BaseToy;
import task3_1.model.entity.CarToy;

public class DataSource {
    public static BaseToy[] getToys(){
        return new BaseToy[]{
                new CarToy("SuperCar","Red super car descr",100,5,10),
                new CarToy("Ferari","Ferari car descr",200,6,20),
                new CarToy("Lotus","Lotus super car",200,8,30),
                new CarToy("Lanos","Police car",20,3,12),
                new ShipToy("Titanic","Titanic model",2100,16,15000),
                new ShipToy("Getman Sgaydachnyi","Ukrainian military ship",1200,10,500)
        };

    };
}
