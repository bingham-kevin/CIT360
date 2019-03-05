package JSONexample;

import java.util.Scanner;

public class View {
    public void runProgram() {
        Scanner in = new Scanner(System.in);

        System.out.print("Read or create JSON - (Enter '1' Read or '2' to Create) - ");
        Integer choice = in.nextInt();
        if(choice == 1){
            ReadJSON readJSON = new ReadJSON();
            readJSON.readFile();
        }else if(choice == 2){
            CreateJSON makeJSON = new CreateJSON();
            makeJSON.create();
        }
    }
}
