package Model;

import Controller.Operator;

public class Add implements Operator {

    public Double calc(Double num1, Double num2) {
        Double sum = num1 + num2;
        return sum;
    }
}

