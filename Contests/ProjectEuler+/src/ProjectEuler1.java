import java.util.Scanner;

/**
 * Created by lakshitha on 7/12/16.
 */
public class ProjectEuler1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();
        while (T-- > 0) {
            long N = reader.nextInt();
            N -= 1;
            System.out.println(sum (N/3)*3 + sum (N/5)*5 - sum(N/15)*15);
        }
    }

    public static long sum(long n) {
        return n * (n+1) / 2;
    }
}
