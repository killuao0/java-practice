package controlflow;

import java.util.Scanner;

public class Ifelse {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your gender");
        char ch= sc.next().charAt(0);
        char gender= ch;
        if (gender == 'M'){
            System.out.println("Good morning Sir");
        }else {
            System.out.println("Good morning Mam");
        }

    }
}
