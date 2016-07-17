import java.util.Scanner;

/**
 * Created by lakshitha on 7/17/16.
 */
public class ProjectEuler3 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int testCases = s1.nextInt();

        while (testCases-- > 0){
            System.out.println(primeFactorization(s1.nextLong()));
        }

    }

    public static long primeFactorization(long n){
        long max = 2;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n%i == 0){
                while(n%i == 0)
                    n = n/i ;
                max = i;
            }
        }
        if (n > 1 && n > max)
            max = n ;

        return max;
    }
}
