package graphs;

import java.util.*;

/**
 * Implementation of a simple undirected graph using adjacency table methodology
 * Adjacency will be achieved using a HashMap
 * **/
public class Graph {

    int numberOfNode;

    HashMap<String, Node> adjacentList;

    public Graph() {
        numberOfNode = 0;
        adjacentList = new HashMap<>();
    }

    public void addVertex(String value) {
        if (adjacentList.containsKey(value)) {
            return;
        }
        Node newNode = new Node(value);
        adjacentList.put(newNode.getValue(), newNode);
        numberOfNode++;
    }

    public void addEdge(String node1, String node2) {
        if (adjacentList.containsKey(node1)) {
            Node existingNode = adjacentList.get(node1);

            if (!existingNode.getConnections().contains(node2)) {
                existingNode.getConnections().add(node2);
            }
        }
    }

    public void showConnections() {
        Iterator<Map.Entry<String, Node>> it = adjacentList.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, Node> pair = it.next();
            System.out.println(pair.getKey() + " -> " +  pair.getValue().getConnections());
        }
    }

}
