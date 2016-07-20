import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Lakshitha on 7/20/2016.
 */
public class ProjectEuler20 {
    public static BigInteger [] factorials;
    public static int [] digitSum;

    public static void main(String[] args) {

        factorials = new BigInteger[1001];
        digitSum = new int[1001];
        Scanner s1 = new Scanner(System.in);
        factorial();

        int testCases = s1.nextInt();
        while (testCases-- > 0){
            int index = s1.nextInt();
            if (digitSum[index] == 0)
                digitSum[index] = calculateDigitSum(index);

            System.out.println(digitSum[index]);
        }

    }

    public static void factorial(){
        factorials[0] = new BigInteger("1");
        factorials[1] = new BigInteger("1");

        for (int i = 2; i < 1001 ; i++)
            factorials[i] = factorials[i-1].multiply(new BigInteger(String .valueOf(i)));
    }

    public static int calculateDigitSum(int index){
        String value = factorials[index].toString();
        int sum = 0;
        for (int i = 0; i <value.length() ; i++)
            sum += Character.getNumericValue(value.charAt(i));
        return sum;
    }

}
