import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int T = s1.nextInt();

        while(T-- > 0){
            int n = s1.nextInt();
            int m = s1.nextInt();
            int s = s1.nextInt();

            int ans = ((m+s-1)%n == 0 )? n : ((m+s-1)%n) ;
            System.out.println(ans);

        }
    }
}
