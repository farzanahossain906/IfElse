import java.util.Scanner;

public class SalaryProgram {
    public static void main(String[] args) {
        //declaring variable

        int basicSalary, employeeID;
        String name;
        //creating scanner
        Scanner scanner=new Scanner(System.in);
        //read out what user enter
        System.out.println("Employee id: ");
        employeeID=scanner.nextInt();
        System.out.println("Enter name: ");
        name=scanner.next();
        System.out.println("Enter basic salary" );
        basicSalary=scanner.nextInt();

           float HRA=(basicSalary*10)/100;
           float TA=(basicSalary*9)/100;
           float DA =(basicSalary*8)/100;
           float PF=(basicSalary*20)/100;
           double GrossSalary= basicSalary+HRA+TA+DA-PF;
           //expected output
        System.out.println("Your HRA is: "+HRA);
        System.out.println("Your TA is: "+TA);
        System.out.println("Your DA is: "+DA);
        System.out.println("Your PF is: "+TA);
        System.out.println("Your Gross Salary is: "+GrossSalary);
    }
}
