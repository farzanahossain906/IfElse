import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {

        String alphabet;
        //creating scanner
        Scanner scanner = new Scanner(System.in);
        //direction for user what to enter
        System.out.println("Enter any alphabet in uppercase");
        String line=scanner.nextLine();
        //uppercase will be replaced with lowercase
        System.out.println("Lowercase letter is: "+ (line.toLowerCase()));


    }
}
