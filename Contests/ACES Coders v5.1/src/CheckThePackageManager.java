import java.util.*;

/**
 * Created by lakshitha on 7/17/16.
 */
public class CheckThePackageManager {

    public static Map<String,ArrayList<String>> adjListMap;
    public static boolean[] visited;
    public static boolean depend;

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int dependencies = Integer.parseInt(s1.nextLine());
        adjListMap = new HashMap<String, ArrayList<String>>();

        while (dependencies-- > 0){
            String [] input  = s1.nextLine().split(" ");

            if (adjListMap.containsKey(input[1])){
                adjListMap.get(input[1]).add(input[0]);
            }
            else {
                ArrayList<String > tmp = new ArrayList<String>();
                tmp.add(input[0]);
                adjListMap.put(input[1], tmp);
            }
        }

        String [] givenOrder = s1.nextLine().split(" ");

        for (int i = 1; i < givenOrder.length; i++) {
            for (int j = 0; j < i; j++) {
                if (isDepend(givenOrder[i], givenOrder[j])) {
                    System.out.println("wrong");
                    return;
                }
            }
        }

        System.out.println("correct");


    }

    public static boolean isDepend(String a, String b){

        depend = false;
        visited = new boolean[27];
        topologicalSort(a,b);
        return depend;

    }

    public static void topologicalSort(String a, String b){
        if (depend) return;
        if (a.equals(b)) {
           depend = true;
            return;
        }
        if (visited[a.charAt(0) - 'A'])
            return;
        visited[a.charAt(0) - 'A'] = true;

        if (adjListMap.containsKey(a))
            for (int i = 0; i < adjListMap.get(a).size(); i++)
                topologicalSort(adjListMap.get(a).get(i), b);

    }

}


