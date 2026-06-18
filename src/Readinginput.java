import java.util.Scanner;

public class Readinginput {
    static void main(String[] args) {
        /*
        INPUT CLASS
         */
        //SYNTAX
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int number1= sc.nextInt();
        System.out.println("integer value =" + sc);
        System.out.println("enter second integer value");
        int number2= sc.nextInt();
        System.out.println("integer value=" + sc);
        System.out.println("number1 =" +number1+ "\nnumber2 =" +number2);
        int s= number1+number2;
        System.out.println("num1 + num2 =" + s);
        System.out.println("enter your name");
        String name= sc.next();
        System.out.println("enter your age");
        String age= sc.nextLine();
        System.out.println("your name is " + name + " and you are " + age + " years old");

        //FOR CHAR
        char ch= sc.next().charAt(1);
        System.out.println(ch);


    }

}

