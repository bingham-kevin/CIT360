package Controller;

import Model.Add;
import Model.Divide;
import Model.Multiply;
import Model.Subtract;

import java.util.HashMap;

public class CalculatorControlPattern {

    public static HashMap<String, Operator> operatorMap = new HashMap<>();

    public Double calculate(String operation, Double num1, Double num2) {

        operatorMap.put("+", new Add());
        operatorMap.put("-", new Subtract());
        operatorMap.put("*", new Multiply());
        operatorMap.put("/", new Divide());

        Operator runCalc = operatorMap.get(operation);

        return runCalc.calc(num1, num2);
    }

}
