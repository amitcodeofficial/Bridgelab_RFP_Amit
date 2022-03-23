import java.lang.Math.*;

public class Wage {

    public static int random(){
        int min=0;
        int max=1;

        double r=Math.random()*(max-min+1)+min;
        int ra=(int) r;
        return ra;
    }
    public static void check(int random){
        int WagePerHour=20;
        int HalfDay=4;
        int FullDay=8;
        int WageCount=0;
        if(random == 0){
            System.out.println("Employee Worked Half Day = 4 hrs");
            WageCount=WagePerHour*HalfDay;
            System.out.println("The Wage for "+HalfDay+" hrs is "+WageCount+" Rs");
        }else{
            System.out.println("Employee Worked Full Day = 8 hrs");
            WageCount=WagePerHour*FullDay;
            System.out.println("The Wage for "+FullDay+" hrs is "+WageCount+" Rs");
        }
    }
    public static void main(String[] args){
        int random=Wage.random();
        check(random);
    }
}
