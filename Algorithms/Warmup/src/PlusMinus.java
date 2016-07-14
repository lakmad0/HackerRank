import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class PlusMinus {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int plus=0,minus=0,zeroes=0;

        int n= s1.nextInt();
        int [] array =new int[n];

        for(int i=0;i<n;i++){
            int n1 =s1.nextInt();
            if(n1<0)
                minus++;
            else if(n1==0)
                zeroes++;

            else
                plus++;

        }

        int ans = plus +minus +zeroes;

        double p=(double)plus/ans;
        String str = String.format("%.03f",p);
        System.out.println(str);

        double m=(double)minus/ans;
        str = String.format("%.03f",m);
        System.out.println(str);

        double z=(double)zeroes/ans;
        str = String.format("%.03f",z);
        System.out.println(str);

    }
}
