package graphs;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("1");
        graph.addVertex("4");
        graph.addVertex("3");
        graph.addVertex("5");

        graph.addEdge("3", "1");
        graph.addEdge("3", "4");

        graph.showConnections();
    }
}
