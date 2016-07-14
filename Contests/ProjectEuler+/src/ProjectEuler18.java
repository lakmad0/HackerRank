import java.util.Scanner;

/**
 * Created by lakshitha on 7/12/16.
 */
public class ProjectEuler18 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int test = s1.nextInt();

        while(test-- > 0){
            int level = s1.nextInt();
            int [][] data = new int[level][];

            for(int i = 0; i < level; i++){
                data[i] = new int[i+1];
                for(int j =0 ; j < i+1 ; j++){
                    data[i][j] = s1.nextInt();
                }
            }

            for (int r = data.length - 1; r > 0; r--)
                for (int c = 0; c < data[r].length - 1; c++)
                    data[r - 1][c] += Math.max(data[r][c], data[r][c + 1]);

            System.out.println(data[0][0]);
        }
    }
}
