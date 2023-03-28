import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int num;
        //object of scanner class
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number: ");
        num=scanner.nextInt();
        //checks the number is positive, negative or zero
        if (num>0){
            System.out.println("This is a positive number.");
        }else if (num<0){
            System.out.println("This is a negative number.");
        }else {
            System.out.println("The number is zero.");
        }
    }
}
