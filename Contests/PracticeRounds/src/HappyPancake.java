import java.util.Scanner;

/**
 * Created by lakshitha on 7/18/16.
 */
public class HappyPancake {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int testCases = s1.nextInt();

        while (testCases-- > 0){
            char[] s = s1.next().toCharArray();
            int n = s.length;
            int count = 0;

            for (int i = 1; i < n; i++) {
                if (s[i] != s[i-1]) count++;
            }
            if (s[n-1] == '-') count++;

            System.out.println(count);
        }
    }
}
