import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int answer;
        char sign; //assign the value +, -, *, /
        //showing welcome message
        System.out.println("Welcome user ");
        //taking input from user
        System.out.println("Enter the first number: ");
        //read number given by user with scanner
        a=scanner.nextInt();
        System.out.println("Enter the second number: ");
        b=scanner.nextInt();
        //ask user what operand they want to user
        System.out.println("Enter an operand you want to use: ");
        sign=scanner.next().charAt(0);
        //receive input from user
        if (sign=='+'){
            answer=a+b;
            System.out.println(a+" "+sign+" "+b+"="+answer);//addition
        }else if (sign=='-'){
            answer=a-b;
            System.out.println(a+" "+sign+" "+b+"="+answer);//subtraction
        }else if (sign=='*'){
            answer=a*b;
            System.out.println(a+" "+sign+" "+b+"="+answer);//multiplication
        }else if (sign=='/'){
            answer=a/b;
            System.out.println(a+" "+sign+" "+b+"="+answer);//division
        }
    }
}

