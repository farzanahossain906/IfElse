import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        //acknowledge user what to input
        System.out.println("Enter an year: ");
        Scanner scanner=new Scanner(System.in);
        year=scanner.nextInt();
        //conditions of leap year
        if (year%400==0){
            System.out.println(year + " is a leap year.");
        }else if (year%4==0){
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
