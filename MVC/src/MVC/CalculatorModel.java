package MVC;

public class CalculatorModel {
    private double result;

    public void calculate(Double first, Double secondN, String oper) {
        switch (oper){
            case "+": this.add(first, secondN); break;
            case "-": this.substract(first, secondN); break;
            case "*": this.multiply(first, secondN); break;
            case "/": this.divide(first, secondN); break;
        }
    }


    public void add(double firstN, double secondN){
        result = firstN + secondN;
    }

    public void substract(double firstN, double secondN){
        result = firstN - secondN;
    }

    public void multiply(double firstN, double secondN){
        result = firstN * secondN;
    }

    public void divide(double firstN, double secondN){
        result = firstN / secondN;
    }

    public double getResult(){
        return result;
    }

}
