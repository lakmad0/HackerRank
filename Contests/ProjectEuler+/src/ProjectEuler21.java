import java.util.Scanner;

/**
 * Created by Lakshitha on 7/20/2016.
 */
public class ProjectEuler21 {
    public static int [] divisorSum;
    public static int [] amicablePairSum;
    public static int max = 10000005;
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        divisorSum = new int[max];
        amicablePairSum = new int[max];
        generateDivisorSum();
        sumOfAmicablepairs();

        int testCases = s1.nextInt();

        while (testCases-- > 0){
            int index = s1.nextInt() - 1;
            System.out.println(amicablePairSum[index]);
        }
    }

    public static void sumOfAmicablepairs(){
        amicablePairSum[0] = 0;
        amicablePairSum[1] = 0;
        for (int i = 2; i <100005 ; i++) {
            if ( i == divisorSum[divisorSum[i]] && i != divisorSum[i])
                amicablePairSum[i] = amicablePairSum[i-1] + i ;
            else
                amicablePairSum[i] = amicablePairSum[i-1];
        }
    }

    public static void generateDivisorSum(){
        divisorSum[0] = 0;
        divisorSum[1] = 0;
        for (int i = 1; i < max ; i++) {
            for (int j = 2*i; j < max ; j += i) {
                divisorSum[j] += i;
            }
        }
    }
}
