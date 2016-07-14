import java.util.Scanner;

/**
 * Created by lakshitha on 7/14/16.
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int h1 = s.charAt(0)-'0';
        int h2 = s.charAt(1)-'0';
        int m1 = s.charAt(3)-'0';
        int m2 = s.charAt(4)-'0';
        int s1 = s.charAt(6)-'0';
        int s2 = s.charAt(7)-'0';

        if(s.charAt(8)=='A' && (m1+m2+s1+s2)==0 && h1==1 && h2==2)
            System.out.println("00:00:00");
        else if(s.charAt(8)=='A' &&  h1==1 && h2==2)
            System.out.println("00:"+s.charAt(3)+s.charAt(4)+":"+s.charAt(6)+s.charAt(7));
        else if( s.charAt(8)=='A' )
            System.out.println(""+s.charAt(0) +s.charAt(1)+":"+s.charAt(3)+s.charAt(4)+":"+s.charAt(6)+s.charAt(7));
        else if( h1*10+h2<12&& s.charAt(8)=='P' )
            System.out.println((10*h1+h2+12)+":"+s.charAt(3)+s.charAt(4)+":"+s.charAt(6)+s.charAt(7));
        else
            System.out.println((10*h1+h2)+":"+s.charAt(3)+s.charAt(4)+":"+s.charAt(6)+s.charAt(7));

    }

}
