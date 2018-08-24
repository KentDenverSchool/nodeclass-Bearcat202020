import java.util.ArrayList;

public class Node {
    private int data;
    private ArrayList<Node> nodes;


    public Node (int data, Node node){
        this.data = data;
        nodes = new ArrayList<>();
        nodes.add(node);
    }

    public void addNode(Node node){
        nodes.add(node);
    }

}