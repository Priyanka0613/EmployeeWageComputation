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
                System.out.println("Your Daily Wage is: " + Employee.dailyWage());
                break;
            
            case 4:
                System.out.println("Your Monthly Wage is: " + Employee.monthlywagecheck());
                break;

        }

        s.close();
    }
}
