package Model;

import Controller.Operator;

public class Subtract implements Operator {

    public Double calc(Double num1, Double num2) {
        Double difference = num1 - num2;
        return difference;
    }
}

