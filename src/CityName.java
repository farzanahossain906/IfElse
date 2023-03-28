import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        String City;
        //what to input by the user
        System.out.println("Enter first letter of the city: ");
        Scanner scanner = new Scanner(System.in);
        //user will write first letter of the city
        City = scanner.next();
        //putting conditions
        if (City.startsWith("A")) {
            System.out.println("Ahmedabad");
        }else if (City.startsWith("B")){
            System.out.println("Bangkok");
        }else if (City.startsWith("C")){
            System.out.println("Chennai");
        }else if (City.startsWith("D")){
            System.out.println("Delhi");
        }else if (City.startsWith("E")){
            System.out.println("Eton");
        }else if (City.startsWith("F")){
            System.out.println("Florence");
        }else {
            System.out.println("Invalid input.");
        }
    }
}