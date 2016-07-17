import java.util.Scanner;

/**
 * Created by lakshitha on 7/15/16.
 */
public class ReachOneFast {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int testCases = s1.nextInt();

        while (testCases-- > 0){
            int aliceNumber = s1.nextInt();
            int bobNumber = s1.nextInt();

            int aliceStep = solve(aliceNumber);
            int bobStep = solve(bobNumber);

            System.out.println(aliceStep+" "+bobStep);

            if (aliceStep > bobStep)
                System.out.println("BOB");
            else if (bobStep > aliceStep)
                System.out.println("ALICE");
            else
                System.out.println("DRAW");
        }
    }

    public static int solve(int n){

        if(n == 1)
            return 0;

        if(n%3 == 0 && n%2 == 0)
            return getMin3((1+solve(n/3)),(1+solve(n/2)), (1+solve(n-1)));
        else if(n%3 == 0)
            return Math.min((1+solve(n/3)),(1+solve(n-1)));
        else if (n%2 == 0)
            return Math.min((1+solve(n/2)),(1+solve(n-1)));
        else
            return (1+solve(n-1));
    }

    public static int getMin3(int n1, int n2, int n3){
        if (n1 < Math.min(n2,n3))
            return  n1;
        else
            return Math.min(n2,n3);
    }
}
