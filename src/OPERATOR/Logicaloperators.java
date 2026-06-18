package OPERATOR;

public class Logicaloperators {
    static void main(String[] args) {
        System.out.println(10>9 && 10<9);
        System.out.println(10<9 && 10>9);
        // && operator is used in condition, if either condition is false the result becomes false

        System.out.println(10>9 || 10<9);
        // || operator is used in condition, if either condition is true the result becomes true


        // in both these operators when both conditions are true result becomes true and is same with false
        int a= 12 , b= 22;
        System.out.println(a++>12 && b++>=22);
        System.out.println(a+ " " + b);
        /* in this condition as our first condition is false our compiler wont read the second
        condition and hence the value of b will remain unchanged
         */
        int c= 12 , d= 22;
        System.out.println(c++>12 || d++>=22);
        System.out.println(c+ " " + d);
        /* in this even if our first condition is false our compiler will read the second
        condition and hence the value of b will change
         */

    }
}
