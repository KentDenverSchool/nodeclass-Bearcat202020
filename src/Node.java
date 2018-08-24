import java.util.ArrayList;

public class Node {
    private double data;
    private ArrayList<Node> nodes;


    public Node (double data, Node node){
        this.data = data;
        nodes = new ArrayList<>();
        if(node != null) {
            nodes.add(node);
        }
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }


}