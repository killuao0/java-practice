package controlflow;

public class Switch {
    public static void main(String[] args) {
        int daynum=10;
        String dayname= "";
        switch (daynum){
            case 1:
                dayname= "monday";
                break;
            case 2:
                dayname= "tuesday";
                break;
            case 3:
                dayname= "wednesday";
                break;
            case 4:
                dayname= "thursday";
                break;
            case 5:
                dayname= "friday";
                break;
            case 6:
                dayname= "saturday";
                break;
            case 7:
                dayname= "sunday";
                break;
            default:
                System.out.println("invalid");
        }
        System.out.println(dayname);
        // not putting break will run the code utnil it reaches a break and it is called fall through
        //incase only int string and character are allowed, floating numbers arent allowed
        // if we put -> in place of : we dont have to put break in btw






        // NEW SWITCH
        char ch= 'y';
        switch (ch){
            case 'a' , 'e' , 'i' , 'o', 'u'-> System.out.println("vowel");
            default-> System.out.println("consonant");
        }


    }
}
