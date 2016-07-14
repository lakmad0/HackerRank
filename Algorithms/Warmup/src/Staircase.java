import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class Staircase {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print("#");
            }

            System.out.println();

        }
    }
}
