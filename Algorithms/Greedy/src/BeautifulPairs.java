import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class BeautifulPairs {
    public static void main(String[] args) {


        Scanner s1 = new Scanner(System.in);
        int beautifulCount = 0;

        int n = s1.nextInt();

        int [] frequencyList1 = new int[1000];
        int [] frequencyList2 = new int[1000];

        for(int j = 0; j < n; j++){
           frequencyList1[s1.nextInt()-1]++;
        }
        for(int j = 0; j < n; j++){
           frequencyList2[s1.nextInt()-1]++;
        }

        for(int j = 0; j < 1000; j++){
            beautifulCount += Math.min(frequencyList1[j],frequencyList2[j]);
        }
        // we shold change one element in second array
        beautifulCount = (beautifulCount == n) ? (beautifulCount-1) : (beautifulCount+1);

        System.out.println(beautifulCount);

    }
}
