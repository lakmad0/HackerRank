import java.util.Scanner;

/**
 * Created by lakshitha on 7/15/16.
 */
public class CharlieAndTheGiantChocolate {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int testCases = s1.nextInt();

        while (testCases-- > 0){
            int height = s1.nextInt();
            int width = s1.nextInt();

            System.out.println(binomialCoefficient(height+width,width));


        }
    }

    public static long binomialCoefficient(int n, int k) {
        long res = 1;

        if ( k > n - k )
            k = n - k;

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }
}
