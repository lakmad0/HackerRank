import java.util.Scanner;

/**
 * Created by lakshitha on 7/17/16.
 */
public class ProjectEuler2 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int testCases = s1.nextInt();

        while (testCases-- > 0){
           System.out.println(getSum(s1.nextLong()));
        }
    }

    public static long getSum(long n){
        long n1 = 1;
        long n2 = 2;
        long ans = 0;

        if (n > 2)
            ans = 2;

        long tmp = n1+n2 ;
        while ( tmp<= n){
            if (tmp%2 == 0)
                ans += tmp;
            n1 = n2;
            n2 = tmp;
            tmp = n1 +n2;
        }

        return  ans;
    }
}
