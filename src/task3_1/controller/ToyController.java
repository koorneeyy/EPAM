package task3_1.controller;


import task3_1.data.DataSource;
import task3_1.model.ToyRoom;
import task3_1.view.ToysView;

public class ToyController {
    ToyRoom model = new ToyRoom();
    ToysView view = new ToysView();

    public void run() {
     /*   model.setToys(DataSource.getToys());
        view.printToys(ToysView.ALL_TOYS, model.getToys());
        view.printMessage(ToysView.PRICE_SUM + String.valueOf(model.getTotalPrice()));
        view.printMessage(ToysView.COUNT + String.valueOf(model.getToysCountInRoom()));
        view.printToys(ToysView.BY_NAME, model.orderByName());
       view.printToys(ToysView.BY_AGE_FILTER, model.getToysByAge(5));
        */
    }
}
