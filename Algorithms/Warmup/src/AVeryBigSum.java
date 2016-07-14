import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class AVeryBigSum {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        long sum =0;
        long n = s1.nextInt();
        for(long i=0; i<n; i++){
            long  n1 =s1.nextLong();
            sum += n1;

        }
        System.out.println(sum);
    }
}
