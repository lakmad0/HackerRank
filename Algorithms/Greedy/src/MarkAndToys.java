import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class MarkAndToys {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int n = s1.nextInt();
        int k = s1.nextInt();

        int count = 0;

        int [] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = s1.nextInt();
        }

        Arrays.parallelSort(price);

        int sum = 0;
        int i = 0;

        while(sum <= k){
            sum += price[i++];
            count++;
        }

        System.out.println(count-1);

    }
}
