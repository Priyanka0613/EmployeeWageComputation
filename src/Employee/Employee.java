package Employee;
import java.util.Random;

public class Employee {
    public static int checkPresentAbsent(){
        Random random = new Random();
        return random.nextInt(2);
    }
    static int x=checkPresentAbsent();
    public static void printPresentAbsent(){
        // int x=checkPresentAbsent();
        if(x==0){System.out.println("absent");}
        else{System.out.println("present");}
    }

    public static int fulltimeParttime(){
        Random random = new Random();
        return random.nextInt(2); //0->parttime; 1->fulltime
    }

    public static int dailyWage(){
        int fulltimehour=8;
        int parttimehour=4;
        if(fulltimeParttime()==1){
            return x*20*fulltimehour;
        }else{
            return x*20*parttimehour;
        }
    }
}
