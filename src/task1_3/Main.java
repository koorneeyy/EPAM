package task1_3;

import task1_3.controller.PyramidController;
import task1_3.model.PyramidModel;
import task1_3.view.PyramidView;

public class Main {

    public static void main(String[] args) {
        PyramidView view = new PyramidView();
        PyramidModel model = new PyramidModel();
        PyramidController controller = new PyramidController(view, model);
        controller.calculateAndDrawPyramid();

    }


}
