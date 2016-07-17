import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/17/16.
 */
public class ProjectEuler10 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int testCases = s1.nextInt();
        ArrayList<Integer> primes = generatePrimes(100000007);

        while (testCases-- > 0){
            int n = s1.nextInt();
            long ans = 0;
            int i = 0;
            while (primes.get(i) <= n)
                ans += primes.get(i++);

            System.out.println(ans);
        }

    }

    public static ArrayList<Integer> generatePrimes(int limit) {

        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean [] isComposite    = new boolean [limit];

        for (int i = 2; i*i < limit; i++) {
            if (!isComposite [i]) {
                for (int j = i; j*i < limit ; j++)
                    isComposite [j*i] = true;
            }
        }
        for (int i = 2; i < limit; i++)
            if (!isComposite [i])
                primes.add(i);
        return primes;
    }
}
