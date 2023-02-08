public class Main {
    // Exercise 1: The point of this exercise is to make sure you understand how
    //to write and invoke methods that take parameters.
    public static void zool(int i,String s,String z){
        System.out.println(i);
        System.out.println(s);
        System.out.println(z);

    }
    public static void main(String[] args) {
        int i = 11; //passing value to zool
        String s = "Harry"; //name of first pet
        String z = "Thonabrucky"; //street grew up on

        String day = "Wednesday";
        String month = "February";
        int date = 8;
        int year = 2023;

        zool(i,s,z);
        printAmerican(day,month,date,year);
        printEuropean(day, month, date,year);
    }

    //Exercise 2: The purpose of this exercise is to take code from a previous
    //exercise and encapsulate it in a method that takes parameters. See code from Date and Time (Week 2)
    public static void printAmerican(String day, String month, int date, int year){
        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + date + ", " + year + "\n");
    }

    public static void printEuropean(String day, String month, int date, int year){
        System.out.println("European Format:");
        System.out.println(day + ", " + date + " " + month + ", " + year + "\n");
    }
}