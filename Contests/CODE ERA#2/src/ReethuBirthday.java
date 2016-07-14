import java.io.*;
import java.util.*;

import java.util.regex.Pattern;
 
public class ReethuBirthday{
	public static int countSubstring(String subStr, String str){
		
		return str.split(Pattern.quote(subStr), -1).length - 1;
	}
 
	public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        String no = s1.next();
       if( countSubstring("00", no)>0)
           System.out.println("YES");
        else
            System.out.println("NO"); 
		
	}
}