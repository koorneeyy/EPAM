package task1_2;

import task1_2.controller.MagicNumberController;
import task1_2.model.MagicNumberModel;
import task1_2.view.MagicNumberView;

public class Main {

    public static void main(String[] args) {
        MagicNumberModel model = new MagicNumberModel();
        MagicNumberView view = new MagicNumberView();
        MagicNumberController controller = new MagicNumberController(view, model);
        controller.findMagicNumbers();
    }

}
