import java.util.Scanner;

public class InterchangedValue {
    public static void main(String[] args) {
        int a, b,c ;
        Scanner scanner=new Scanner(System.in);
        //acknowledge the user what to input
        System.out.println("Input the first number: ");
        a=scanner.nextInt();
        System.out.println("Input the second number: ");
        b=scanner.nextInt();
        c=a;
        a=b;
        b=c;


        System.out.println("Swapped values are: " +a+"and"+b);

    }
}
