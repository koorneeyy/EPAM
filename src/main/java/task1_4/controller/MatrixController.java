package task1_4.controller;

import task1_4.model.MatrixModel;
import task1_4.view.InputUtility;
import task1_4.view.MatrixView;

public class MatrixController {

    private MatrixView view;
    private MatrixModel model;

    public MatrixController(MatrixView view, MatrixModel model) {
        this.view = view;
        this.model = model;
    }

    public void rotateRandomMatrix(){
    model.setDimensions(InputUtility.inputIntValueWithScanner(view));
    model.createRandomMatrix();
    view.printMessageAndResult(MatrixView.MATRIX_ORIGINAL,model.printMatrix());
    model.rotateMatrix();
    view.printMessageAndResult(MatrixView.MATRIX_ROTATED,model.printMatrix());


    }
}
