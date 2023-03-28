import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //acknowledge the user to put numbers 5 times
        System.out.println("Input first number: ");
        int num1=scanner.nextInt();
        System.out.println("Input second number: ");
        int num2=scanner.nextInt();
        System.out.println("Input third number: ");
        int num3=scanner.nextInt();
        System.out.println("Input fourth number: ");
        int num4=scanner.nextInt() ;
        System.out.println("Input fifth number: ");
        int num5=scanner.nextInt();

        //average score should print
        System.out.println("Average of five numbers is: "+(num1 + num2 + num3 + num4 + num5 )/5);
    }
}
