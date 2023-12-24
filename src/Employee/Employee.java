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

    public static int dailyWage(){
        int fulltimehour=8;
        int parttimehour=4;
        if(fulltimeParttime()==1){
            return x*20*fulltimehour;
        }else{
            return x*20*parttimehour;
        }
    }

    public static int monthlywagecheck(){
        int fulltimehour=8;
        int parttimehour=4;
        if(fulltimeParttime()==1){
            return 20*x*20*fulltimehour;
        }else{
            return 20*x*20*parttimehour;
        }
    }

    public static int monthlywagecheckcond(){
        int day=0;
        int hour=0;
        while(day<=20 && hour<=100){
            if(x==1){
                day++;
                if(y==0){
                    hour+=4;
                }else{
                    hour+=8;
                }
            }
        }

        int wage=hour*20;
        return wage;
    }
}
