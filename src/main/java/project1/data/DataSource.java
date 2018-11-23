package project1.data;

import project1.data.interfaces.CargoPassPlane;
import project1.data.interfaces.CargoPlane;
import project1.data.interfaces.PassPlane;
import project1.data.interfaces.Plane;

public class DataSource {
    public static Plane [] getPlanes(){
        return  new Plane[]{
                new CargoPlane("Ан-225 «Мрія»",13.5f,25550,808),
                new CargoPlane("Airbus A-380" ,9.5f,1550,620),
                new PassPlane("Boeing 747" ,11.5f,8750,605),
                new PassPlane("Ан-124" ,5.4f,3512,28),
                new CargoPassPlane("Lockheed C-5 Galaxy" ,4.4f,8524,200,56),
                new CargoPassPlane("Ан-22 «Антей»" ,3.4f,9898,250,22)
        };
    }
}
