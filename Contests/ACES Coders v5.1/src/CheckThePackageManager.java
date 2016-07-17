import java.util.*;

/**
 * Created by lakshitha on 7/17/16.
 */
public class CheckThePackageManager {
    public static void main(String[] args) {

        ArrayList<String> softwareType = new ArrayList<String>();
        Graph graph = new Graph();
        Scanner s1 = new Scanner(System.in);
        int dependencies = Integer.parseInt(s1.nextLine());

        while (dependencies-- > 0){
            String [] input  = s1.nextLine().split(" ");
            if (!softwareType.contains(input[0])){
                softwareType.add(input[0]);
                graph.addVertex();
            }
            if (!softwareType.contains(input[1])){
                softwareType.add(input[1]);
                graph.addVertex();
            }

            graph.addEdge(softwareType.indexOf(input[0]), softwareType.indexOf(input[1]));
        }


        ArrayList<String> order = new ArrayList<String>(Arrays.asList(s1.nextLine().split(" ")));
        ArrayList<Integer> realOrder = graph.topologicalSort();
        System.out.println(realOrder);
        System.out.println(order);


    }
}


class Graph {

    public Map<Integer,ArrayList<Integer>> adjListMap;

    int numberOfVertices;
    int numberOfEdges;

    public Graph(int numberOfVertices, int numberOfEdges) {
        this.numberOfVertices = numberOfVertices;
        this.numberOfEdges = numberOfEdges;
        adjListMap = new HashMap<Integer, ArrayList<Integer>>();

        for (int i = 0; i <numberOfVertices ; i++) {
            adjListMap.put(i, new ArrayList<Integer>());

        }

    }

    public Graph(int numberOfVertices)  {
        this.numberOfVertices = numberOfVertices;
        this.numberOfEdges = 0;
        adjListMap = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i <numberOfVertices ; i++) {
            adjListMap.put(i, new ArrayList<Integer>());

        }
    }

    public Graph() {
        this.numberOfVertices = 0;
        this.numberOfEdges = 0;
        adjListMap = new HashMap<Integer, ArrayList<Integer>>();
    }

    public void addVertex(){
        int v = this.numberOfVertices;
        adjListMap.put(v,new ArrayList<Integer>());
        numberOfVertices++ ;
    }

    public void addEdge(int v, int w){
        adjListMap.get(v).add(w);
        this.numberOfEdges++ ;
    }

    public List<Integer> getNeighbors(int v){
        return new ArrayList<Integer>(adjListMap.get(v));
    }

    public List<Integer> dfs(int root){

        boolean[] visited = new boolean[numberOfVertices];
        ArrayList<Integer> list = new ArrayList<Integer>();

        dfs(visited, root, list);

        for (int i = 0; i < numberOfVertices ; i++) {
            if (!visited[i])
                dfs(visited, i, list);
        }

        return list;
    }

    private void dfs(boolean [] visited, int v, List<Integer> searchPath){
        visited[v] = true;
        searchPath.add(v);
        //System.out.print(v + " ");
        for(int w : adjListMap.get(v)){
            if(!visited[w]){
                dfs(visited, w, searchPath);
            }
        }
    }

    public List<Integer> bfs(int root){

        boolean[] visited = new boolean[numberOfVertices];
        ArrayList<Integer> searchPath = new ArrayList<Integer>();

        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.addFirst(root);
        visited[root] = true;

        while (!queue.isEmpty()){

            int v = queue.pollLast();
            searchPath.add(v);

            for (int w : adjListMap.get(v)){
                if (!visited[w]){
                    visited[w] = true;
                    queue.addFirst(w);
                }
            }
        }

        return searchPath;
    }

    public void topologicalSort(int v, boolean [] visited,LinkedList<Integer> stack) {

        visited[v] = true;

        for(int w : adjListMap.get(v)){
            if(!visited[w]){
                topologicalSort(w, visited, stack);
            }
        }

        stack.addFirst(v);
    }

    public ArrayList<Integer> topologicalSort() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> stack = new LinkedList<>();

        boolean [] visited = new boolean[numberOfVertices];

        for (int i = 0; i < numberOfVertices; i++) {
            if (!visited[i]) {
                topologicalSort(i, visited, stack);
            }
        }

        while (!stack.isEmpty())
            list.add(stack.pollFirst());

        return list;
    }


    @Override
    public String toString() {
        return "Graph{" +
                "adjListMap=" + adjListMap +
                ", numberOfVertices=" + numberOfVertices +
                ", numberOfEdges=" + numberOfEdges +
                '}';
    }

    //unit Test
   /* public static void main(String[] args) {

        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 5  );
        g.addEdge(4, 5);
        // g.addEdge(3, );
        System.out.println(g);

//        System.out.println(g.dfs(5));
//        System.out.println(g.bfs(5));

        ArrayList<Integer> list = g.topologicalSort();
        System.out.println(list);
    }*/
}

