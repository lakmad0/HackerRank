import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class TwoArrays {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int testCases = s1.nextInt();

        while (testCases-- >0){

            int n = s1.nextInt();
            int k = s1.nextInt();

            int [] array1 = new int[n];
            int [] array2 = new int[n];

            for (int i = 0; i < n; i++) {
                array1[i] = s1.nextInt();
            }
            for (int i = 0; i < n; i++) {
                array2[i] = s1.nextInt();
            }

            Arrays.parallelSort(array1);
            Arrays.parallelSort(array2);

            for (int i = 0; i <n ; i++) {
                if (array1[i] + array2[n-i-1] < k){
                    System.out.println("NO");
                    break;
                }
                else if (i == n-1){
                    System.out.println("YES");
                }
            }

        }

    }
}
