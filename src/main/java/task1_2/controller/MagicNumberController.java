package task1_2.controller;

import task1_2.model.MagicNumberModel;
import task1_2.view.InputUtility;
import task1_2.view.MagicNumberView;

public class MagicNumberController {
    private MagicNumberView view;
    private MagicNumberModel model;

    public MagicNumberController(MagicNumberView view, MagicNumberModel model) {
        this.view = view;
        this.model = model;
    }

    public void findMagicNumbers(){
        model.setValueToFind(InputUtility.inputIntValueWithScanner(view));
        view.printMessageAndResult(MagicNumberView.RESULT,model.findMagicNumber());
    }

}
