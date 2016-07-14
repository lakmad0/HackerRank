import java.io.*;
import java.util.*;
import java.math.*;

public class SumAndDifference {

    public static void main(String[] args) {
       Scanner s1 = new Scanner(System.in);
        int sumPrime=0,sumSquare=0;
        
        int n= s1.nextInt();
        int n2= s1.nextInt();
        
        for(int i=n;i<=n2;i++){
            if(isPrime(i)){
                sumPrime += i;
               
            }
            if(isPerfect(i)){
                sumSquare += i; 
                
            }
        }
       
        System.out.println(sumPrime-sumSquare);
        
    }

    static boolean isPerfect(int n){

            if((int)Math.sqrt(n)*(int)Math.sqrt(n) == n)
                return true;
            else 
                return false;

    }

    static boolean isPrime(int n) {
        if(n == 0||n==1)
           return false;               
        else if(n == 2)
            return true;
        else{
          for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
          }            
        }
       
        return true;
   }
}
