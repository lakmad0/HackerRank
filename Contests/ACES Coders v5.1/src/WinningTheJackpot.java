import java.util.Scanner;

/**
 * Created by lakshitha on 7/15/16.
 */
public class WinningTheJackpot {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int A = s1.nextInt();
        int B = s1.nextInt();
        int K = s1.nextInt();

        long count = 0;

        for (int i = 0; i < A ; i++) {
            for (int j = 0; j <B ; j++) {
                if ((i & j) < K)
                    count++;
            }
        }

        System.out.println(count);
    }
}
