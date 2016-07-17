import java.util.Scanner;

/**
 * Created by lakshitha on 7/15/16.
 */
public class ImaginaryNestedVirtualMachines {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int realTime = s1.nextInt();
        int expectedTime = s1.nextInt();
        int turnOnTime = s1.nextInt();

        int level = 0;
        boolean posibility = true;

        while (expectedTime < realTime){
            level++;
            expectedTime = (expectedTime - 2* turnOnTime)*2;
            if (expectedTime < 0) {
                posibility = false;
                break;
            }
            if (expectedTime == (expectedTime - 2* turnOnTime)*2){
                posibility = false;
                break;
            }

        }
        if (posibility)
            System.out.println(level+" "+(expectedTime-realTime));
        else
            System.out.println("impossible");
    }
}
