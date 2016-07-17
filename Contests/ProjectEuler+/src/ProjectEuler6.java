import java.util.Scanner;

/**
 * Created by lakshitha on 7/17/16.
 */
public class ProjectEuler6 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int test = s1.nextInt();

        while(test-- > 0){
            long squreSum = 0 ;
            long sumSqure = 0 ;
            long sum = 0 ;

            int n = s1.nextInt();

            for(int i = 1 ; i<= n ;i++){
                squreSum += (long)Math.pow(i,2) ;
                sum += i;
            }
            sumSqure = (long)Math.pow(sum,2) ;

            System.out.println((long)(sumSqure -squreSum));
        }

    }
}
