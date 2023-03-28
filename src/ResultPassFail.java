import java.util.Scanner;

public class ResultPassFail {
    public static void main(String[] args) {
        String name;
        int roll, english, math, science;
        Scanner scanner=new Scanner(System.in);
        //giving user direction what to write
        System.out.println("Enter name: ");
        name=scanner.nextLine();
        System.out.println("Enter roll number: ");
        roll=scanner.nextInt();
        System.out.println("Enter marks in english, maths, science");
        math=scanner.nextInt();
        english=scanner.nextInt();
        science=scanner.nextInt();

        int total=english+math+science;
        float percentage=(float) total/300*100;
//storing variables
        System.out.println("roll number:"+roll);
        System.out.println("marks,(english, maths, science )");
        System.out.println("Your Total number is : "+total);
        System.out.println("Your percentage is= "+total/3);
        //pass or fail conditions
        if (percentage>=35){
            System.out.println(" You are passed");
        }else {
            System.out.println("You are failed");
        }
    }
}
