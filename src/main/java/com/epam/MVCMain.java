package com.epam;


import com.epam.controller.CalculateController;
import com.epam.model.CalculateModel;
import com.epam.view.CalculateView;

public class MVCMain {
    public static void main(String[] args) {

        CalculateView view = new CalculateView();
        CalculateModel model = new CalculateModel();
        CalculateController controller =
                new CalculateController(model, view);
        controller.calculate();
    }
}
