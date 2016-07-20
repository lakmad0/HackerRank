import java.util.Scanner;

/**
 * Created by lakshitha on 7/17/16.
 */
public class ProjectEuler11 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int product = 0;
        int [][] array = new int[20][20];

        for(int i=0 ; i<20 ; i++)
            for(int j=0 ; j<20 ; j++)
                array[i][j] = s1.nextInt();

        for(int i=0 ; i<20 ; i++){
            for(int j=0 ; j<20 ; j++){

                if(i<17 && j< 17){ // to check right diogonal
                    int prod = array[i][j] * array[i+1][j+1] * array[i+2][j+2] *array[i+3][j+3];
                    if(prod > product)
                        product = prod ;
                }
                if(i<17 && j>2){  //to check left diogonal
                    int prod = array[i][j] * array[i+1][j-1] * array[i+2][j-2] *array[i+3][j-3];
                    if(prod > product)
                        product = prod ;
                }
                if(i<17){ // to check down
                    int prod = array[i][j] * array[i+1][j] * array[i+2][j] *array[i+3][j];
                    if(prod > product)
                        product = prod ;
                }
                if(j<17){ // to check left
                    int prod = array[i][j] * array[i][j+1] * array[i][j+2] *array[i][j+3];
                    if(prod > product)
                        product = prod ;
                }
            }
        }

        System.out.println(product);

    }
}
