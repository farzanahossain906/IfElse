import java.util.Scanner;

public class Vote {
    Scanner scanner= new Scanner(System.in);

    public void eligibleForVote()
    {
        //acknowledge the user what to enter
        System.out.println("Please enter your age in integer value");

        //storing age in variable using scanner object
        int age =scanner.nextInt();

        if (age>=18)
        {
            System.out.println("Eligible for vote as age is :"+age);
        }else {
            System.out.println("Not eligible as age is:"+age);
        }
    }

    public static void main(String[] args) {
        //creating class object to call non-static area
        Vote vote =new Vote();
        //calling method using class object
        vote.eligibleForVote();
    }
}
