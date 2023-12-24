package Employee;
import java.util.Random;

public class Employee {
    public static void checkPresentAbsent(){
        Random random = new Random();
        int x= random.nextInt(2);
        if(x==0){System.out.println("You were absent!");}
        else{System.out.println("You were present");}
    }
}
