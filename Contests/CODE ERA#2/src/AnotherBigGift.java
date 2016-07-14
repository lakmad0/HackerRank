import java.io.*;
import java.util.*;

import java.util.regex.Pattern;
 
public class AnotherBigGift {
	public static boolean bigGift(String str){
        int count = 0;
        int [] array = new int[26];
        
        for(int i=0;i<str.length();i++){
            int temp =str.charAt(i)-'a';
            if(array[temp] == 0){
                count++;
                array[temp] = 1;
            }      
            if(count == 26)
                break;
        }
       
               
        StringBuilder sb = new StringBuilder(str);        
        sb.reverse(); 
       
		   
        return sb.toString().equals(str) && count == 26;
	}
 
	public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        String gift = s1.next();
       if(bigGift(gift))
           System.out.println("YES");
        else
            System.out.println("NO");
           
           
        
		
	}
}