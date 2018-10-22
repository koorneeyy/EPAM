package com.epam.controller;

import com.epam.InputUtility;
import com.epam.model.CalculateModel;
import com.epam.view.CalculateView;

public class CalculateController {
    private CalculateModel model;
    private CalculateView view;

    public CalculateController(CalculateModel model,
                               CalculateView view) {
        this.model = model;
        this.view = view;
    }
    public void calculate() {
        model.setValue(InputUtility.inputIntValueWithScanner(view));
        model.incrementValue();
        view.printMessageAndResult(view.OUR_INT,
                model.getValue());
    } }