import java.io.*;
import java.util.*;

import java.util.regex.Pattern;
 
public class SecondGift {
	public static int idealString(String str){
        int count = 0;
        for(int i=1;i<str.length()-1;i++){
            int temp = Character.getNumericValue(str.charAt(i))+Character.getNumericValue(str.charAt(i-1))+Character.getNumericValue(str.charAt(i+1));
            if(temp == 10){
                count++;
                break;
            }         
        }
		return count;
	}
 
	public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        String gift = s1.next();
       if(idealString(gift)>0)
           System.out.println("YES");
        else
            System.out.println("NO");
           
           
        
		
	}
}