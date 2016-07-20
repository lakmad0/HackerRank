import java.util.Scanner;

/**
 * Created by lakshitha on 7/20/16.
 */

/*
 *  http://www.mathblog.dk/project-euler-25-fibonacci-sequence-1000-digits/
 */
public class ProjectEuler25 {
    public static double theta = (1+Math.sqrt(5))/2;
    public static double logTheta = Math.log(theta);
    public static double l2 = Math.log(10) / logTheta ;
    public static double l1 = Math.log(Math.sqrt(5)) / logTheta;

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int testCases = s1.nextInt();

        StringBuilder sb = new StringBuilder();

        while (testCases-- > 0){
            int digits = s1.nextInt();
            sb.append(String.valueOf(countFibonacci(digits))).append("\n");
        }
        System.out.println(sb);

    }

    public static long countFibonacci(int digits){
        return  (long)Math.ceil( l2*(digits - 1) + l1 );
    }
}
