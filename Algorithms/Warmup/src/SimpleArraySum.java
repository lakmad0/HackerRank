import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int sum = 0;
        for(int i=0 ; i<n ;i++){
            int s  = s1.nextInt();
            sum += s;

        }
        System.out.println(sum);
    }
}
