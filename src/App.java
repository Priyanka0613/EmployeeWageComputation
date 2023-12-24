import java.util.Scanner;
import Employee.Employee;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation");

        Scanner s=new Scanner(System.in);
        System.out.println("Press 1 for attendance check");
        System.out.println("Press 2 for fultime/partime check");
        System.out.println("Press 3 for daily wage check");
        System.out.println("Press 4 for monthly wage check");
        System.out.println("Press 5 for monthly wage under condition check");
        System.out.println("*************************************************");
        int option=s.nextInt();

        switch(option){
            case 1:
                Employee.printPresentAbsent();
                break;
            
            case 2:
                Employee.printfulltimeparttime();
                break;

            case 3:
                System.out.print("Enter your wage per hour: ");
                int x=s.nextInt();
                System.out.println("Your Daily Wage is: " + Employee.dailyWage(x));
                break;
            
            case 4:
                System.out.print("Enter your wage per hour: ");
                int a=s.nextInt();
                System.out.print("Enter your working days per month: ");
                int y=s.nextInt();
                System.out.println("Your Monthly Wage is: " + Employee.monthlywagecheck(a,y));
                break;
            
            case 5:
                System.out.print("Enter your wage per hour: ");
                int b=s.nextInt();
                System.out.print("Enter your working days per month: ");
                int c=s.nextInt();
                System.out.print("Enter your wokrking hours per month: ");
                int z=s.nextInt();
                System.out.println("Your Monthly Wage under condition is: " + Employee.monthlywagecheckcond(b,c,z));
                break;

            default:
                System.out.println("Invalid request");
        }

        s.close();
    }
}
