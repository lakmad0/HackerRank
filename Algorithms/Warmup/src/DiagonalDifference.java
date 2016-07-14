import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int maind=0,secd=0;

        int n = s1.nextInt();
        int [][] mat = new int [n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = s1.nextInt();
                if (i==j)
                    maind += mat[i][j];
                if (i==(n-1)-j)
                    secd += mat[i][j];
            }

        }
        if(maind-secd >0)
            System.out.println(maind-secd);
        else
            System.out.println(secd-maind);


    }
}
