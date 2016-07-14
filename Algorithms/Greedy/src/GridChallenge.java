import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/13/16.
 */
public class GridChallenge {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int test = s1.nextInt();
        String [] strings;
        boolean accepted;

        while(test-- > 0){

            accepted = false;
            int lenght = s1.nextInt();
            strings = new String[lenght];

            // To get input and sort according to lexiographically
            for (int i = 0; i<lenght;i++){
                char [] tmp = s1.next().toCharArray();
                Arrays.sort(tmp);
                strings[i] = new String (tmp);

            }

            accepted = isAccepted(strings);

            if (accepted)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }

    // to check array is sorted
    public static boolean isSorted(char [] chars){

        for (int i =0; i<chars.length-1 ;i++){
            if (chars[i] > chars[i+1])
                return false;
        }

        return true;
    }



    public static boolean  isAccepted(String [] strings){
        StringBuilder [] stringBuilders = new  StringBuilder[strings.length];

        for (int i = 0; i < strings.length; i++){
            stringBuilders[i] = new StringBuilder();
        }


        for (int i = 0; i < strings.length; i++){
            for (int j = 0; j < strings[i].length(); j++){
                stringBuilders[j].append(strings[i].charAt(j));
            }
        }

        for (int i = 0; i < strings.length; i++){
           if (!isSorted(stringBuilders[i].toString().toCharArray())){
               return false;
           }
        }

        return true;
    }
}
