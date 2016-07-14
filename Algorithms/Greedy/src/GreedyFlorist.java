import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class GreedyFlorist  {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int k = s1.nextInt();

        int [] price = new int[n];

        for (int i = 0; i <n ; i++) {
            price[i] = s1.nextInt();
        }

        Arrays.sort(price);

        int tmp = 0;
        int pivot = 1;

        int amount = 0;

        for (int i = n-1; i >= 0 ; i--) {
            if (tmp == k){
                tmp = 0;
                pivot++;
            }

            tmp++;
            amount += pivot * price[i] ;

        }

        System.out.println(amount);
    }

}
