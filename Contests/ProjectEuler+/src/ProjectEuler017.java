import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/11/16.
 */
public class ProjectEuler17 {

    public static HashMap<Integer,String> basicNumbers = new HashMap<Integer, String>();
    public static HashMap<Integer,String> tens = new HashMap<Integer, String>();
    public static HashMap<Integer,String> thousands = new HashMap<Integer, String>();

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        initialize();

        int t = s1.nextInt();

        while (t-- > 0){

            String number = s1.next();
            String solution = "";

            if (number.length() == 12){
                if (name(number.substring(0,3)) != "")
                    solution += name(number.substring(0,3)) +" Billion" ;
                if (name(number.substring(3,6)) != "")
                    solution += " " + name(number.substring(3,6)) +" Million";
                if (name(number.substring(6,9)) != "")
                    solution += " " + name(number.substring(6,9)) +" Thousand";
                if (name(number.substring(9)) != "")
                        solution += " "+name(number.substring(9)) ;
            }

            else if (number.length() == 11){
                if (name(number.substring(0,2)) != "")
                    solution += name(number.substring(0,2)) +" Billion" ;
                if (name(number.substring(2,5)) != "")
                    solution += " " + name(number.substring(2,5)) +" Million";
                if (name(number.substring(5,8)) != "")
                    solution += " " + name(number.substring(5,8)) +" Thousand";
                if (name(number.substring(8)) != "")
                    solution += " "+name(number.substring(8)) ;

            }

            else if (number.length() == 10){

                if (name(number.substring(0,1)) != "")
                    solution += name(number.substring(0,1)) +" Billion" ;
                if (name(number.substring(1,4)) != "")
                    solution +=  " "+ name(number.substring(1,4)) +" Million";
                if (name(number.substring(4,7)) != "")
                    solution +=  " "+ name(number.substring(4,7)) +" Thousand";
                if (name(number.substring(7)) != "")
                    solution += " "+name(number.substring(7)) ;

            }

            else if (number.length() == 9){
                if (name(number.substring(0,3)) != "")
                    solution += name(number.substring(0,3)) +" Million";
                if (name(number.substring(3,6)) != "")
                    solution += " "+ name(number.substring(3,6)) +" Thousand";
                if (name(number.substring(6)) != "")
                    solution += " "+name(number.substring(6)) ;
            }

            else if (number.length() == 8){
                if (name(number.substring(0,2)) != "")
                    solution += name(number.substring(0,2)) +" Million";
                if (name(number.substring(2,5)) != "")
                    solution += " "+ name(number.substring(2,5)) +" Thousand";
                if (name(number.substring(5)) != "")
                    solution += " "+name(number.substring(5)) ;
            }

            else if (number.length() == 7){
                if (name(number.substring(0,1)) != "")
                    solution += name(number.substring(0,1)) +" Million";
                if (name(number.substring(1,4)) != "")
                    solution += " "+name(number.substring(1,4)) +" Thousand";
                if (name(number.substring(4)) != "")
                    solution += " "+name(number.substring(4)) ;
            }

            else if (number.length() == 6){
                if (name(number.substring(0,3)) != "")
                    solution += name(number.substring(0,3)) +" Thousand";
                if (name(number.substring(3)) != "")
                    solution += " "+name(number.substring(3)) ;

            }

            else if (number.length() == 5){
                if (name(number.substring(0,2)) != "")
                    solution += name(number.substring(0,2)) +" Thousand";
                if (name(number.substring(2)) != "")
                    solution += " "+name(number.substring(2)) ;
            }

            else if (number.length() == 4){
                if (name(number.substring(0,1)) != "")
                    solution += name(number.substring(0,1)) +" Thousand";
                if (name(number.substring(1)) != "")
                    solution += " "+name(number.substring(1)) ;
            }

            else if (number.length() == 3)
                solution = name(number);

            else if (number.length() == 2)
                solution = name(number);

            else if (number.length() == 1)
                solution = name(number);

            System.out.println(solution.trim());


        }

    }

    public static String name(String number){

        String ans = "";

        if (number.length() == 3) {
            if ( basicNumbers.get(Character.getNumericValue(number.charAt(0))) != "Zero")
                ans = basicNumbers.get(Character.getNumericValue(number.charAt(0))) + " Hundred";

            if (Character.getNumericValue(number.charAt(1)) > 1){
                    ans += " " + tens.get( Character.getNumericValue(number.charAt(1)) );
                    if(basicNumbers.get( Character.getNumericValue(number.charAt(2)) ) != "Zero")
                        ans += " " + basicNumbers.get( Character.getNumericValue(number.charAt(2)) );

            }
            else {
                if (basicNumbers.get(Integer.parseInt(number.substring(1))) != "Zero")
                    ans += " " +  basicNumbers.get(Integer.parseInt(number.substring(1))) ;
            }
        }
        else if (number.length() == 2){
            if (Character.getNumericValue(number.charAt(0)) > 1 ){
                ans = tens.get( Character.getNumericValue(number.charAt(0)) );
                if(basicNumbers.get( Character.getNumericValue(number.charAt(1)) ) != "Zero")
                    ans += " " + basicNumbers.get( Character.getNumericValue(number.charAt(1)) );
            }

            else {
                if (basicNumbers.get(Integer.parseInt(number.substring(0))) != "Zero")
                    ans += basicNumbers.get(Integer.parseInt(number.substring(0))) ;
                return  ans;
            }
        }

        if (number.length() ==1)
           ans = basicNumbers.get( Character.getNumericValue(number.charAt(0)) ) ;

        return ans.trim();
    }

    public static void initialize(){

        basicNumbers.put(0,"Zero");
        basicNumbers.put(1,"One");
        basicNumbers.put(2,"Two");
        basicNumbers.put(3,"Three");
        basicNumbers.put(4,"Four");
        basicNumbers.put(5,"Five");
        basicNumbers.put(6,"Six");
        basicNumbers.put(7,"Seven");
        basicNumbers.put(8,"Eight");
        basicNumbers.put(9,"Nine");
        basicNumbers.put(10, "Ten");
        basicNumbers.put(11,"Eleven");
        basicNumbers.put(12,"Twelve");
        basicNumbers.put(13,"Thirteen");
        basicNumbers.put(14,"Fourteen");
        basicNumbers.put(15,"Fifteen");
        basicNumbers.put(16,"Sixteen");
        basicNumbers.put(17,"Seventeen");
        basicNumbers.put(18, "Eighteen");
        basicNumbers.put(19,"Nineteen");

        tens.put(2,"Twenty");
        tens.put(3,"Thirty");
        tens.put(4,"Forty");
        tens.put(5,"Fifty");
        tens.put(6,"Sixty");
        tens.put(7,"Seventy");
        tens.put(8,"Eighty");
        tens.put(9,"Ninety");

        thousands.put(1,"Thousand");
        thousands.put(2,"Million");
        thousands.put(3,"Billion");
        thousands.put(3,"Trillion");


    }
}
