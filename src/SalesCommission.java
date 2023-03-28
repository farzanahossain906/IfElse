import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        //creating variables
        int salesID, basic;
        double amount;
        String name;
        //creating scanner
        Scanner scanner=new Scanner(System.in);
        //direction to user what to enter
        System.out.println("Enter sales ID: ");
        salesID=scanner.nextInt();
        System.out.println("Enter seller's name: ");
        name=scanner.next();
        System.out.println("Enter basic salary:");
        basic=scanner.nextInt();
        System.out.println("Enter sales amount:");
        amount=scanner.nextDouble();
        //putting conditions
        if (amount>=50000){
            System.out.println("Seller's sales commission is 35%.");
        }else if (amount>=30000){
            System.out.println("Seller's sales commission is 20%.");
        }else if (amount>=20000){
            System.out.println("Seller's sales commission is 10%.");
        }else if (amount>=10000){
            System.out.println("Seller's sales commission is 10%.");
        }else if (amount<10000){
            System.out.println("Seller's sales commission is 5%.");
        }
    }
}
