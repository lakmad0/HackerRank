import java.util.Scanner;

/**
 * Created by lakshitha on 7/12/16.
 */
public class ProjectEuler19 {

    public static class Date{
        long year;
        int month;
        int day;
        public Date(long year,int month,int day){
            this.year = year;
            this.month =month;
            this.day = day ;
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int testCases = s1.nextInt();

        while(testCases-- > 0){

            Date date1 = new Date(s1.nextLong(),s1.nextInt(),s1.nextInt());
            Date date2 = new Date(s1.nextLong(),s1.nextInt(),s1.nextInt());

            System.out.println(calculateSundays(date1,date2));
        }

    }

    public static int calculateSundays( Date date1, Date date2){
        int count = 0;

        if (date1.day > 1)
            date1.month++;

        //for starting year
        for (int m = date1.month; m <= 12; m++) {
            if (getDate(date1.year, m, 1) == 0)  // Sunday
                count++;
        }

        //for end year
        for (int m = 1; m <= date2.month; m++) {
            if (getDate(date2.year, m, 1) == 0)  // Sunday
                count++;
        }

        //for intemideate years
        for (long y = date1.year+1; y <= date2.year -1 ; y++) {
            for (int m = 1; m <= 12; m++) {
                if (getDate(y, m, 1) == 0)  // Sunday
                count++;
            }
        }

        return count ;
    }


    public static int getDate(long year,int month, int day){
        int m = (month - 2 + 12) % 12;
        if (month <= 2){
            year--;
        }

        int y = 5 * (int)(year % 4) + 4 * (int)( year % 100) + 6 * (int)(year % 400) ;
        int dayOfWeek = (day + (int) (2.6 * m - 0.2) + y) % 7 ;

        return dayOfWeek;
    }

}
