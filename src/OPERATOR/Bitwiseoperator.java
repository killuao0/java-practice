package OPERATOR;

public class Bitwiseoperator {
    static void main(String[] args) {
        System.out.println(4&5);
        System.out.println(4|5);
        System.out.println(4^5);

        /*in bitwise & , eg; 4- 100 and 5-101
        the output becomes 4 on unit and tenth place there are 0 and result is 100
        ; similarly in bitwise | with same eg; the output becomes 5 as in unit and hundreth place we have 1

        ; in case of bitwise xor '^' if the two number are same result becomes 0 and if the number are different
         result becomes 1, hence the number becomes 100 snd output becomes 1
        */
        System.out.println(~5);// turns one to zero and vice versa
        System.out.println(5<<1); // shift binary to left, to calculate value 5* 2^n
        System.out.println(16>>2); //shift binary to right, to calculate value 16/^n

        int a= 9;
        a = a+10;
        a += 10; //shorthand operator, it also does typecasting by itself
        System.out.println(a);
        byte b= 9;
        b += 10;
        System.out.println(b); // no error because of implicit typecasting
    }
}
