import java.util.Scanner;

public class Swap {
    static void main(String[] args) {
        //swap
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();

        int temp = num1;
         num1 = num2;
         num2 = temp;
        System.out.println("after swap a = " + num1 + " after swap b = " + num2);
        // if a char is entered in place of int there is an error "inputmismatcherror"
        
    }
}
