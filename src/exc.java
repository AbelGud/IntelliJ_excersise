import java.util.ArrayList;
import java.util.Scanner;

public class exc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //String ex = "quit";
        ArrayList<String> names = new ArrayList<>();

        boolean isName = true;
        /*
        while (isName) {
            System.out.println("Please insert names: ");
            String name = input.nextLine();
            if (names.equals("quit")) {
                System.out.println(names);
                break;
            }
            names.add(name);
            //names.add(2,name);
           // names.set(1, "zerihun");

        }
        */

        do {
            System.out.println("Pleas insert names: ");
            String name = input.nextLine();
            if (name.equals(("quit"))) {
                System.out.println(names);
                isName = false;
                break;
            }
            names.add(name);
        }
        while (isName);

        String fname[] = {"hanna","able","zedo"};
        for(String name:fname){
            System.out.println(name);
        }



    }


}
