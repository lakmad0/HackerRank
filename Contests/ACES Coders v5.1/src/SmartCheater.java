import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/16/16.
 */
public class SmartCheater {

    public static void main(String[] args) {

        ArrayList<String> code1 = new ArrayList<String >();
        ArrayList<String> code2 = new ArrayList<String >();

        Scanner s1 = new Scanner(System.in);
        boolean multiLineComment = false;
        int endCount = 0;
        boolean copied = false;

        String start = "/*start*/" ;
        String end = "/*finish*/";

        while (s1.hasNextLine()){

            ArrayList<String> dummy;
            String tmp = s1.nextLine().trim().replaceAll("\\s+","").replaceAll("[{}]+","");


            if (tmp.equals(end)){
                endCount++;
            }

            if (endCount == 0)
                dummy = code1;
            else if(endCount == 1)
                dummy = code2;
            else
                break;

            if (tmp.equals(start)){
                multiLineComment = false;
                continue;
            }
            if (tmp.equals(end)){
                continue;
            }


            if (tmp.length() >=2 && tmp.substring(0,2).equals("/*"))
                multiLineComment = true;
            else if (tmp.length() >= 2  && tmp.substring(0,2).equals("*/")){
                multiLineComment = false;
                continue;
            }


            if (tmp.equals("") || (tmp.length() >=2 &&  tmp.substring(0,2).equals("//")) || tmp.substring(0,1).equals("#") || multiLineComment)
                continue;

            dummy.add(tmp);


        }
        copied = isCopied(code1, code2);

        if (copied)
            System.out.println("true");
        else
            System.out.println("false");

    }

    public static boolean isCopied(ArrayList<String> code1, ArrayList<String> code2){

        for (String string :code1){
            if (!code2.contains(string)){
                return false;
            }
            code2.remove(string);
        }
        return true;
    }
}
