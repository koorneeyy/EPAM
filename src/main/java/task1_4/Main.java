package task1_4;

import task1_4.controller.MatrixController;
import task1_4.model.MatrixModel;
import task1_4.view.MatrixView;

public class Main {

    public static void main(String[] args) {
        MatrixView view=new MatrixView();
        MatrixModel model=new MatrixModel();
        MatrixController controller=new MatrixController(view,model);
        controller.rotateRandomMatrix();

    }

}
