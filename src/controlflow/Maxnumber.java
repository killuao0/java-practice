package controlflow;

public class Maxnumber {
    public static void main(String[] args) {
        int a = 12, b = 15, c = 9;
        if (a>b){
            if (a>c){
                System.out.println("max number " + a);}
        }else if (c>a){
            if (c>b){
                System.out.println("max number " +c);}
        }else{
            System.out.println("max number " +b);}

    }
}
