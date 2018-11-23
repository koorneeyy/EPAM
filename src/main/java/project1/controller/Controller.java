package project1.controller;


import project1.data.interfaces.Plane;
import project1.model.Model;
import project1.utils.InputUtility;
import project1.utils.Menu;
import project1.view.AirView;

import java.util.Arrays;

public class Controller {
    private Model model=new Model();
    private AirView view=new AirView();

public void run(){
    view.printMessage(AirView.MENU);
    while (true){
        int number = InputUtility.inputInt(view);
        Menu command = defineMenuItem(number);
        switch (command) {
            case EXIT:
                System.exit(0);
                break;
            case SHOW_AIRCRAFTS:
                Plane[] planes = model.showAll();
                Arrays.stream(planes).forEach(plane -> view.printMessage(plane.toString()));
                break;
            case SORT_BY_DISTANCE:
                Plane[] planesSort = model.sortByDistance();
                Arrays.stream(planesSort).forEach(plane -> view.printMessage(plane.toString()));
                break;
            case FIND_BY_FUEL:
                float min=InputUtility.inputFloat(view);
                float max=InputUtility.inputFloat(view);
                Plane[] planesByField = model.findByField(min,max);
                Arrays.stream(planesByField ).forEach(plane -> view.printMessage(plane.toString()));
            break;
        }

    }
}

    private Menu defineMenuItem(int number) {
        Menu[] itemMenus = Menu.values();
        if (number < 0 || number >= itemMenus.length) {
            return Menu.DEFAULT;
        }
        return itemMenus[number];
    }
}
