package project1.model;

import project1.data.DataSource;
import project1.data.interfaces.Plane;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Model {
    Plane[] planes= DataSource.getPlanes();

    public Plane[] showAll(){
        return planes;
    }
    public Plane[] sortByDistance(){
        Arrays.sort(planes, Comparator.comparing(Plane::getDistance));
        return planes;
        }

    public Plane[] findByField(float min, float max) {
        Plane[] results=new Plane[planes.length];
        int index=0;
        for (Plane p:planes){
            if (p.getFuelPerHour()>min&&p.getFuelPerHour()<max){
                results[index]=p;
                index++;
            }

        }

        return Arrays.copyOf(results, index);
    }
}
