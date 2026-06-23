package controlflow;

public class Discount {
    public static void main(String[] args) {
        int amount= 10000;
        double discount= 0;
        if (amount > 0 && amount <= 5000);
        else if (amount > 5000 && amount <= 7000)
        discount= 0.05;
        else if (amount > 7000 && amount <= 9000)
        discount = 0.1;
        else if (amount > 9000 && amount <= 10000)
            discount= 0.2;
        else System.out.println("invalid amount");;
        System.out.println(discount);
        System.out.println(amount*discount);
        double discountamt= amount-(discount*amount);
        System.out.println(discountamt);
    }
}
