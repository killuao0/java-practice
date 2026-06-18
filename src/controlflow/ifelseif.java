package controlflow;

import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("what is your fav ice cream flavour");
        String ice= sc.nextLine();

        if (ice.equals("chocolate")){
            System.out.println("1");
        } else if (ice.equals("vanilla")){
            System.out.println("2");
        }else if (ice.equals("butterscotch")){
            System.out.println("3");
        }
        /*in if else if condition depends on the prior command but in if ladder condition doesnt deped on prior command
        all lines are independent to each other
         */
    }
}
