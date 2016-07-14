import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class PriyankaAndToys {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int n = s1.nextInt();
        int [] weight = new int[n];

        for (int i = 0; i <n ; i++) {
            weight[i] = s1.nextInt();
        }

        Arrays.parallelSort(weight);

        int bonus = -1; //because 0 weighted toys are available
        int units = 0;

        for (int i = 0; i <n ; i++) {
            if (weight[i] <= bonus)
                continue;
            else {
                units++;
                bonus = weight[i] + 4 ;
            }

        }

        System.out.println(units);

    }


}
