package MVC;

public class CalculatorController {

    CalculatorController(CalculatorView theView, CalculatorModel theModel) {

            try {
                double firstNumber = theView.getFirstN();
                double secondNumber = theView.getSecondN();
                String operation = theView.getOper();

                theModel.calculate(firstNumber, secondNumber, operation);

                theView.printResult(theModel.getResult());
            } catch (Exception e) {
                System.out.println(e);
            }
        }

}