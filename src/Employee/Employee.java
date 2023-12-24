package Employee;
import java.util.Random;

public class Employee {
    public static int checkPresentAbsent(){
        Random random = new Random();
        return random.nextInt(2);
    }
    static int x=checkPresentAbsent();

    public static void printPresentAbsent(){
        if(x==0){System.out.println("absent");}
        else{System.out.println("present");}
    }

    public static int fulltimeParttime(){
        Random random = new Random();
        return random.nextInt(2); //0->parttime; 1->fulltime
    }
    static int y=fulltimeParttime();

    public static void printfulltimeparttime(){
        if(x==0){System.out.println("part-time");}
        else{System.out.println("full-time");}
    }

    public static int dailyWage(int wage){
        int fulltimehour=8;
        int parttimehour=4;
        if(fulltimeParttime()==1){
            return x*wage*fulltimehour;
        }else{
            return x*wage*parttimehour;
        }
    }

    public static int monthlywagecheck(int wage, int workingdayspermonth){
        int fulltimehour=8;
        int parttimehour=4;
        if(fulltimeParttime()==1){
            return workingdayspermonth*x*wage*fulltimehour;
        }else{
            return workingdayspermonth*x*wage*parttimehour;
        }
    }

    public static int monthlywagecheckcond(int wage, int workingdayspermonth, int workinghourspermonth){
        int day=0;
        int hour=0;
        while(day<=workingdayspermonth && hour<=workinghourspermonth){
            if(x==1){
                day++;
                if(y==0){
                    hour+=4;
                }else{
                    hour+=8;
                }
            }
        }

        int wageans=hour*wage;
        return wageans;
    }
}
