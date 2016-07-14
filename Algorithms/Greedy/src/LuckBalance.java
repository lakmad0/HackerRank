import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class LuckBalance{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int ans = 0;

        ArrayList<Integer> al =  new ArrayList<Integer>();
        while(N-- > 0){
            int li = in.nextInt();
            int ti = in.nextInt();
            ans += li ;

            if(ti == 1)
                al.add(li);
        }

        Collections.sort(al);
        int fail = al.size() - K ;
        int i = 0;
        while(fail-- > 0){
            ans -= 2 * al.get(i++);
        }

        System.out.println(ans);

    }
}
