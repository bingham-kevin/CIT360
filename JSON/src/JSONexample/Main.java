package JSONexample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        View view = new View();
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Interact with JSON (Enter '1' Run or '2' to Quit) - ");
            Integer runView = in.nextInt();
            if (runView == 1) {
                view.runProgram();
            } else {
                break;
            }
            System.out.println("Program ended.");
        }
    }
}