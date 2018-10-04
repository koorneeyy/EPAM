package task1_1;

import task1_1.controller.ConvertController;
import task1_1.model.NumberModel;
import task1_1.view.ConvertView;

public class Main {

    public static void main(String[] args) {
        ConvertView view = new ConvertView();
        NumberModel model = new NumberModel();
        ConvertController controller = new ConvertController(model, view);
        controller.convertToDiffRepresentation();
    }

}