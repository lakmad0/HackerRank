import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/15/16.
 */
public class MultiReadHeadHardDisk {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int testCases = Integer.parseInt(s1.nextLine());

        while (testCases-- > 0){
            String [] input = s1.nextLine().split(" ");

            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            String [] initial = s1.nextLine().split(" ");
            String [] address = s1.nextLine().split(" ");

            solve(initial,address, x);
        }
    }

    public static void solve(String [] initial, String [] address,int x){

        ArrayList<Long> keys = new ArrayList<Long>();
        ArrayList <Long> possibleKeys = new ArrayList<Long>();

        long tmp = Long.parseLong(initial[0],2);
        boolean posibility = true;

        for (int i = 0; i < address.length ; i++) {
            long tmp1 = Long.parseLong(address[i],2);
            keys.add( tmp^tmp1 );
        }

        for (int i = 1; i < initial.length ; i++) {

            tmp = Long.parseLong(initial[i],2);

            for (int j = 0; j <address.length ; j++) {
                long tmp1 = Long.parseLong(address[j],2);

                if (keys.contains(tmp^tmp1))
                    possibleKeys.add(tmp^tmp1);

            }

            if (possibleKeys.size() == 0){
                posibility = false;
                break;
            }

            keys = possibleKeys;
            possibleKeys = new ArrayList<Long>();

        }

        if (posibility){

            Collections.sort(keys);
            String answer = getAnswer(Long.toBinaryString(keys.get(0)),x);
            System.out.println(answer);
        }
        else
            System.out.println("Impossible");
    }


    public static String getAnswer(String sol, int x){
        if (sol.length() == x)
            return sol;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (x-sol.length()); i++){
            sb.append("0");
        }
        sb.append(sol);

        return sb.toString().trim();
    }

}
