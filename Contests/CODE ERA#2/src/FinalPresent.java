import java.io.*;
import java.util.*;

import java.util.regex.Pattern;
 
public class FinalPresent {
	public static int idealString(String str,int m,int g){
        int count = 0;
        int temp = 0,test = 0;
      
        for(int i=1;i<str.length()-m+2;i++){
            temp = 0;test = 0;
            while(test<m){
                temp += Character.getNumericValue(str.charAt(i-1+test));
                 
                test++;           
            }
           
            
            if(temp == g){
                count++;
                break;
            }         
        }
		return count;
	}
 
	public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
         int m = s1.nextInt();
         int g = s1.nextInt();
        String gift = s1.next();
       
       if(idealString(gift,m,g)>0)
           System.out.println("YES");
        else
            System.out.println("NO");		
	}
}