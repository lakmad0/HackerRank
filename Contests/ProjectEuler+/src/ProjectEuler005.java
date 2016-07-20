import java.util.Scanner;

/**
 * Created by lakshitha on 7/17/16.
 */
public class ProjectEuler5 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int test = s1.nextInt();

        while(test-- > 0){

            int n = s1.nextInt();
            long i = 1;
            long ans = 0 ;

            while(true){

                boolean found = false;

                for(int j = 1 ; j <= n ;j++){

                    if(i%j != 0)
                        break ;
                    else if(j== n){
                        ans = i ;
                        found = true;
                        break;

                    }
                }
                i++;

                if (found)
                    break ;
            }

            System.out.println(ans);
        }

    }
}
