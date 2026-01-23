import java.util.*;
public class SpeedCal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double dist = sc.nextDouble();
        double hr = sc.nextDouble();
        double min = sc.nextDouble();       
        double sec = sc.nextDouble();

        double totalsec = (hr*3600) + (min*60) + sec;
        double mps = dist/totalsec;
        double kph = (dist/1000)/(totalsec/3600);
        double mph = (mps*3600)/1690;     

        System.out.println("mps = " + mps);
        System.out.println("kph = " + kph);
        System.out.println("mph = " + mph);    
    }
}   