package task1_1.controller;

import task1_1.view.InputUtility;
import task1_1.model.NumberModel;
import task1_1.view.ConvertView;

public class ConvertController {
    private NumberModel model;
    private ConvertView view;

    public ConvertController(NumberModel model, ConvertView view) {
        this.model = model;
        this.view = view;
    }

    public void convertTobin() {
        model.setValue(InputUtility.inputIntValueWithScanner(view));
        view.printMessageAndResult(ConvertView.BIN, model.convertToBinary());
        view.printMessageAndResult(ConvertView.OCTA, model.convertToOcta());
        view.printMessageAndResult(ConvertView.HEX, model.convertToHex());
    }
}