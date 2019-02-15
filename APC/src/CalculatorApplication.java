import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        CalculatorControlPattern apcCalc = new CalculatorControlPattern();
        Double num1;
        Double num2;
        String operand = null;

        Scanner in = new Scanner(System.in);

        System.out.println("APC Calculator");
        System.out.println("Enter a numer: ");
        num1 = Double.parseDouble(in.nextLine());
        System.out.println("Choose an operand(+, -, *, /):");
        operand = in.nextLine();
        System.out.println("Enter another number: ");
        num2 = Double.parseDouble(in.nextLine());

        System.out.print(num1 + " " + operand + " " + num2 + " = ");
        Double answer = apcCalc.calculate(operand, num1, num2);
        System.out.println(answer);
    }

}
