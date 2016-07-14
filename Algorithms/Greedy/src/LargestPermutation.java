import java.util.Scanner;

/**
 * Created by lakshitha on 7/13/16.
 */
public class LargestPermutation {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        int n = s1.nextInt();
        int swap = s1.nextInt();

        int [] num = new int[n];
        int [] index = new int[n+1];

        for(int j = 0; j < n; j++){
            num[j] = s1.nextInt();
            index[num[j]] = j;
        }

        for (int i = 0; i < n ; i++) {
            if (swap == 0)
                break;
            if (num[i] == n-i)
                continue;

            int swapTo = index[n-i];
            index[num[i]] =  index[n-i];
            index[n-i] = i;

            swapElement(num,i,swapTo);
            swap--;
        }

        for(int j = 0 ;j < n; j++){
             stringBuilder.append(num[j] +" ");
        }

        System.out.println(stringBuilder.toString().trim() );

    }


    public static void swapElement(int [] num, int i, int j){
            int dummy = num[i];
            num[i] = num[j];
            num[j] = dummy;
    }
}
