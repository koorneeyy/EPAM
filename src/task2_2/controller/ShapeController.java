package task2_2.controller;

import task2_2.data.DataSource;
import task2_2.model.Shapes;
import task2_2.view.InputUtility;
import task2_2.view.ShapeView;

public class ShapeController {
    private Shapes model =new Shapes();
    private ShapeView view =new ShapeView();
    public void run(){
       model.setShapes(DataSource.getShapes());

        while (true){
            view.printMessage(ShapeView.MAIN_MENU);
            int command = InputUtility.inputInt(view);
            switch (command) {
                case 1:
                    view.printShapes(ShapeView.ALL_SHAPES,model.getShapes());
                    break;
                case 2:
                    view.printMessage(ShapeView.SUM_AREA+model.sumArea());
                    break;
                case 3:
                    view.printMessage(ShapeView.SUB_MENU);
                    view.printMessage(ShapeView.SUM_AREA_FIGURE+model.sumAreaByFigure(InputUtility.inputInt(view)));
                    break;
                case 4:
                    model.orderByArea();
                    view.printShapes(ShapeView.ALL_SHAPES,model.getShapes());
                    break;
                case 5:
                    model.orderByColor();
                    view.printShapes(ShapeView.ALL_SHAPES,model.getShapes());
                    break;
                case 6:  System.exit(0);
                    break;

            }

        }


    }
}
