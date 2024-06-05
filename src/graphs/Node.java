package graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {

    String value;
    List<String> connections;

    public Node(String value) {
        this.value = value;
        this.connections = new ArrayList<>();
    }

    public String getValue() {
        return value;
    }

    public List<String> getConnections() {
        return connections;
    }
}
