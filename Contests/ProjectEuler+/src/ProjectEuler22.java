import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/20/16.
 */
public class ProjectEuler22 {

    public static ArrayList<String> words;

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        words = new ArrayList<String>();

        int test = s1.nextInt();
        while(test-- > 0){
            words.add(s1.next());
        }

        Collections.sort(words);

        int queries = s1.nextInt();
        while(queries-- > 0){
            String tmp =s1.next().trim();
            int index = words.indexOf(tmp);
            int ans = solve(tmp) * (index+1);
            System.out.println(ans);
        }

    }

    public static int solve(String s){
        int sum =0;
        for(int i = 0;i < s.length(); i++)
            sum +=  s.charAt(i) -'A'+1;

        return sum;
    }
}
