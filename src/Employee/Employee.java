package Employee;
import java.util.Random;

public class Employee {
    public static int checkPresentAbsent(){
        Random random = new Random();
        return random.nextInt(2);
    }

    public static void printPresentAbsent(){
        int x=checkPresentAbsent();
        if(x==0){System.out.println("absent");}
        else{System.out.println("present");}
    }

    public static int dailyWage(){
        int x=checkPresentAbsent();
        return x*20*8;
    }
}
