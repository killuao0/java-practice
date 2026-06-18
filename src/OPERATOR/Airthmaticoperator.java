package OPERATOR;

public class Airthmaticoperator {
    static void main(String[] args) {
        int a= 1;
        int b= 2;
        System.out.println(a+b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a%b); //% symbol is called modulus, it used to calculate remainder
        // ++ is used to increase value  by one whereas -- is used to decrease by one
        /* it has two types ++a, a++; --a, a--
        operator before a means pre increment, after a means post increment

         */
        System.out.println(a++);// 1, 1+1
        System.out.println(++a); // 2+1
         int e= 1 , f= 2;

        int c= e++ + ++e + --f + f--;
        System.out.println(c);

        char ch='a';
        System.out.println(ch++);
        System.out.println(++ch);  //ascii value of a


    }
}
