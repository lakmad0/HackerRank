import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/13/16.
 */
public class EqualStacks {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }

        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }

        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }

        int height1 = Arrays.stream(h1).sum();
        int height2 = Arrays.stream(h2).sum();
        int height3 = Arrays.stream(h3).sum();

        int i = 0, j = 0, k = 0;
        int count = 0;

        while(!equals3(height1,height2,height3)){
            if(height1 == getMax3(height1,height2,height3)){
                count++;
                height1 -= h1[i++];
            }
            else if(height2 == getMax3(height1,height2,height3)){
                count++;
                height2 -= h2[j++];
            }
            else if(height3 == getMax3(height1,height2,height3)){
                count++;
                height3 -= h3[k++];
            }
        }

        System.out.println(height3);

    }

    public static int getMax3(int n1, int n2, int n3){
        if(Math.max(n1,n2) > n3)
            return  Math.max(n1,n2);
        else
            return n3;
    }

    public static boolean equals3(int n1, int n2, int n3){
        if(n1 == n2 && n2 == n3)
            return true;
        return false;
    }
}
