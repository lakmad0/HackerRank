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
        count = getSundays(date1, date2) - getSundaysBeforeStart(date1) - getSudaysAfterEnd(date2);
        if (date1.day == 1 && getDate(date1.year, date1.month, 1) == 0)
            count++;

        return count ;
    }


    public static int getSundays(Date date1, Date date2){
        int count = 0;
        for (long y = date1.year; y <= date2.year ; y++) {
            for (int m = 1; m <= 12; m++) {
                if (getDate(y, m, 1) == 0)  // Sunday
                    count++;
            }
        }

        return count;
    }

    public static int getSundaysBeforeStart(Date date1){
        int count = 0;
        for (int m = 1; m <= date1.month; m++) {
            if (getDate(date1.year, m, 1) == 0)  // Sunday
                count++;
        }

        return count;
    }

    public static int getSudaysAfterEnd(Date date2){
        int count = 0;
        for (int m = date2.month+1 ; m <=12 ; m++) {
            if (getDate(date2.year, m, 1) == 0)  // Sunday
                count++;
        }

        return count;
    }

    public static int getDate(long year,int month, int day){

        int adjustment = (14 - month) /12 ;
        int m = month + 12 * adjustment - 2 ;
        long y = year - adjustment;

        int dayOfWeek = (int)(( day + (13 * m - 1) /5 + y + y/4 - y/100 +y/400) % 7) ;

        return dayOfWeek;
    }

}
