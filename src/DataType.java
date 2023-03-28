import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        //creating variables
       char value;
        //direction to user what to enter
        System.out.println("Enter any value: ");
        //creating scanner
        Scanner scanner= new Scanner(System.in);
        //read input given by the user
        value=scanner.next().charAt(0);
        if ((value>='a'&&value<='z'||value>='A'&&value<='Z')){
            System.out.println("This is an alphabet.");//alphabet
        }else if (value>='0'&& value<='9'){
            System.out.println("This is a number.");//number
        }else {
            System.out.println("This is a symbol.");//symbol
        }


    }
}
