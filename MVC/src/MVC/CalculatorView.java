package MVC;

import java.util.*;

public class CalculatorView {
    Scanner in = new Scanner( System.in );
    Double firstN;
    String oper;
    Double secondN;


    public void CalculatorView() {
        System.out.print("First number: ");
        firstN = in.nextDouble();
        System.out.print("Operation (+, -, *, /): ");
        oper = in.next();
        System.out.print("Second number: ");
        secondN = in.nextDouble();
    }

    public Double getFirstN(){
        return firstN;
    }
    public Double getSecondN(){
        return secondN;
    }
    public String getOper(){
        return oper;
    }

    public void printResult(double result){
        System.out.println("Answer = " + result);;
    }
}