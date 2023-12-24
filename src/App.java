import Employee.Employee;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation");
        Employee.printPresentAbsent();
        System.out.println("Your Daily Wage is: " + Employee.dailyWage());
    }
}
