import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by lakshitha on 7/14/16.
 */
public class JimAndTheOrders {

    public static void main(String[] args) {

        TreeSet <Order> treeSet = new TreeSet<Order>();
        StringBuilder stringBuilder = new StringBuilder();
        Scanner s1 = new Scanner(System.in);

        int orders = s1.nextInt();

        for (int i = 0; i < orders; i++){
            treeSet.add(new Order(i+1,s1.nextInt()+s1.nextInt()));
        }

        for (Order o : treeSet)
            stringBuilder.append(o.orderId + " ");

        System.out.println(stringBuilder.toString().trim());
    }

}

class Order implements  Comparable<Order>{

    int orderId;
    int finishedTime;

    public Order(int orderId, int finishedTime) {
        this.orderId = orderId;
        this.finishedTime = finishedTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", finishedTime=" + finishedTime +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        if (this.finishedTime < o.finishedTime)
            return -1;
        return  1;
    }
}
