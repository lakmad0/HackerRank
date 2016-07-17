import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lakshitha on 7/15/16.
 */
public class TheLinePrinter {

    public static void main(String[] args) {

        ArrayList<Point2D> arrayList = new ArrayList<Point2D>();

        int [][] mat = new int[256][256];

        Scanner s1 = new Scanner(System.in);
        int n = Integer.parseInt(s1.nextLine());

        while(n-->0){

            String s = s1.nextLine().trim();
            String [] st = s.split("[,() ]+");

            Point2D p1 = new Point2D( Double.parseDouble(st[1]), Double.parseDouble(st[2]));
            Point2D p2 = new Point2D( Double.parseDouble(st[3]), Double.parseDouble(st[4]));

            if (!arrayList.contains(p1))
                arrayList.add(p1) ;
            if (!arrayList.contains(p2))
                arrayList.add(p2) ;
            mat[arrayList.indexOf(p1)][arrayList.indexOf(p2)] = 1;
            mat[arrayList.indexOf(p2)][arrayList.indexOf(p1)] = 1;
        }

        int ones = 0;
        int count =0;

        for (int i = 0; i <256 ; i++) {
            for (int j = 0; j <256 ; j++) {
                if (mat[i][j] == 1)
                    ones++;
            }
            if (ones%2 == 1)
                count++;
            ones = 0;
        }

        if (count == 0 || count == 2)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

class Point2D implements Comparable<Point2D> {

    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point2D p1){
        return Math.sqrt( Math.pow((this.x - p1.x),2) + Math.pow((this.y - p1.y),2));
    }

    /**
     * Returns the polar radius of this point.
     * @return the polar radius of this point in polar coordiantes: sqrt(x*x + y*y)
     */
    public double r() {
        return Math.sqrt(x*x + y*y);
    }

    /**
     * Returns the angle of this point in polar coordinates.
     * @return the angle (in radians) of this point in polar coordiantes (between -pi/2 and pi/2)
     */
    public double theta() {
        return Math.atan2(y, x);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point2D)) return false;

        Point2D point2D = (Point2D) o;

        if (Double.compare(point2D.x, x) != 0) return false;
        return Double.compare(point2D.y, y) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point2D o) {
        return 0;
    }
}
