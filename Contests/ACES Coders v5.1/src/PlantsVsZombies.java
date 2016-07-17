import java.util.Scanner;

/**
 * Created by lakshitha on 7/15/16.
 */
public class PlantsVsZombies {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        double c = s1.nextDouble();
        double f = s1.nextDouble();
        double x = s1.nextDouble();

        double ans = 0.0;
        double currentSpeed = 2.0;

        double currentTime = x/currentSpeed ;
        double nextPlantTime = c/currentSpeed;
        double predictTime = x/(currentSpeed  +  f);

        while (currentTime > nextPlantTime + predictTime){
            ans += nextPlantTime;
            currentSpeed += f;
            currentTime = x/currentSpeed ;
            nextPlantTime = c/currentSpeed;
            predictTime = x/(currentSpeed  +  f);

        }

        ans += currentTime ;
        System.out.printf("%.07f",ans);

    }
}
