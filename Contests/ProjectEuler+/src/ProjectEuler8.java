import java.util.Scanner;

/**
 * Created by lakshitha on 7/17/16.
 */
public class ProjectEuler8 {

    public static void main(String[] args){

        Scanner s1 =new Scanner(System.in);
        int test = s1.nextInt();
        s1.nextLine();

        while(test--> 0){

            int maxProduct = 0 ;


            String s = s1.nextLine();
            String[] parts = s.split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);

            byte [] number = new byte[n];

            String st = s1.nextLine() ;
            //  char[] array = st.toCharArray() ;

            for (int i = 0; i < st.length(); i++)
                number [i] = (byte)Character.getNumericValue(st.charAt(i));

            // System.out.println(st.length() - (k-1));

            for (int i = 0; i < st.length() - (k-1); i++){
                int prod = 1;
                for (int j = i; j < i + k; j++){
                    prod *= number[j] ;
                }

                if (maxProduct < prod)
                    maxProduct = prod ;

            }

            System.out.println(maxProduct);
        }


    }
}
