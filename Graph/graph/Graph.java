package graph;
import java.util.*;
public class Graph {
    private HashMap<Integer, LinkedList<Integer>> adj = new HashMap<>();
    
    public int getSize() {
        return adj.size();
    }

    public void addVertex(int vertex) {
        adj.putIfAbsent(vertex, new LinkedList<Integer>());
    }

    public void removeVertex(int vertex) {
        adj.values().stream().forEach(list -> list.remove(vertex));
        adj.remove(vertex);
    }

    public void dfs(int source, int destination) {
        HashSet<Integer> visited = new HashSet<>();
        visited.add(source);
        boolean isConnected = hasPath(source, destination, visited);
        if (isConnected) {
            System.out.print(source + " ");
        } 
    }

    public boolean hasPath(int source, int destination, HashSet<Integer> visited) {
        if (source == destination) {
            return true;
        }
        for (int neighbor : adj.get(source)) {
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                boolean isConnected = hasPath(neighbor, destination, visited);
                if (isConnected) {
                    System.out.print(neighbor + " ");
                    return true;
                }
            }

        }
        return false;
    }

    // simply replace queue with stack in bfs if you want stack based dfs
    public void bfs(int source, int destination) {
        HashSet<Integer> visited = new HashSet<>();
        Deque<Integer> queue = new LinkedList<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                System.out.print(vertex);
                for (int neighbor : adj.get(vertex)) {
                    queue.add(neighbor);
                }
            }
        }
    }
    public void addEdge(int source, int destination) {
        addVertex(source);
        addVertex(destination);
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }

    public LinkedList<Integer> getAdjacents(int vertex) {
        return adj.get(vertex);
    }

    public static void main(String args[]) {
        Graph graph = new Graph();
        graph.addEdge(1, 6);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);    
        graph.addEdge(2, 9);
        graph.addEdge(3, 7);
        graph.addEdge(4, 9);
        graph.addEdge(7, 9);
        System.out.println(graph.getSize());
        for (int i : graph.getAdjacents(1)) {
            System.out.print(i + " ");
        }
        System.out.println("bfs--");
        graph.bfs(1, 7);
    }
}
