import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int testCases = s1.nextInt();

        while (testCases-- > 0){
            String ans = solve(s1.nextInt());
            System.out.println(ans);
        }

    }

    public static String solve(int n){

        StringBuilder stringBuilder = new StringBuilder();

        int fives = n - (n%3);
        int threes =  n - fives;

        while ((threes%5) != 0){
            fives -= 3;
            threes += 3;

            if(fives < 0 || threes < 0)
                return "-1";
        }

        while (fives-- > 0)
            stringBuilder.append("5");
        while (threes-- > 0)
            stringBuilder.append("3");

        return stringBuilder.toString();
    }
}
