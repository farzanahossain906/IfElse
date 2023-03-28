import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        //declare a variable
        int day;
        //create a scanner
        Scanner scanner=new Scanner(System.in);
        //acknowledge user what to enter
        System.out.println("Enter any weekday number(1-7): ");
        day=scanner.nextInt();
        //putting conditions
          if (day==1) {
              System.out.println("Monday");
          }else if (day==2){
            System.out.println("Tuesday");
        }else if (day==3){
              System.out.println("Wednesday");
          }else if (day==4){
              System.out.println("Thursday");
          }else if (day==5){
              System.out.println("Friday");
          }else if (day==6){
              System.out.println("Saturday");
          }else if (day==7){
              System.out.println("Sunday");
          }
    }
}
