package task1_3.controller;

import task1_3.model.PyramidModel;
import task1_3.view.InputUtility;
import task1_3.view.PyramidView;

public class PyramidController {
    private PyramidView view;
    private PyramidModel model;

    public PyramidController(PyramidView view, PyramidModel model) {
        this.view = view;
        this.model = model;
    }

    public void calculateAndDrawPyramid(){
        model.setLevels(InputUtility.inputIntValueWithScanner(view));
        view.printMessageAndResult(PyramidView.RESULT,model.buidPyramid());
    }

}
