import java.util.Scanner;

public class MarkSheet01 {
    public static void main(String[] args) {
        //creating variables
        String name;
        int roll, english, math, science;
        //creating a scanner
        Scanner scanner=new Scanner(System.in);
        //read out users command
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

        System.out.println("roll number:"+roll);
        System.out.println("marks,(english, maths, science )");
        System.out.println("Your Total number is : "+total);
        System.out.println("Your percentage is= "+total/3);
        //putting condition
        if (percentage>=80){
            System.out.println("Your grade is A+");
        }else if(percentage>=60){
            System.out.println("Your grade is A");
        }else  if (percentage>=50){
            System.out.println("Your grade is B");
        }else if (percentage>=35){
            System.out.println("Your grade is C");
        }
    }
}
