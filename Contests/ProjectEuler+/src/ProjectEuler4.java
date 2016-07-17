import java.util.Scanner;

/**
 * Created by lakshitha on 7/17/16.
 */
public class ProjectEuler4 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int test = s1.nextInt();

        while(test-- > 0){

            int ans = 101101 ;
            int n = s1.nextInt();

            for(int i = 100; i<=999; i++){
                for(int j = 100; j<=999; j++){
                    if(i*j >= n)
                        break ;
                    else if(isPalindrome(i*j) && ans < i*j )
                        ans = i*j ;
                }
            }

            System.out.println(ans);
        }

    }

    public static boolean isPalindrome(int i){
        int j = i;

        int reversenum =0;

        while( j != 0 ){

            reversenum = reversenum * 10;
            reversenum = reversenum + j%10;
            j = j/10;
        }

        return reversenum == i;
    }
}
