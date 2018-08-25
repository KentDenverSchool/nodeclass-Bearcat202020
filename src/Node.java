import java.util.ArrayList;

public class Node {
    private Object data;
    private ArrayList<Node> nodes;


    public Node (Object data, Node node){
        this.data = data;
        nodes = new ArrayList<>();
        if(node != null) {
            nodes.add(node);
        }
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void removeNode(int index){
        if(index > 0 && index < nodes.size()){
            nodes.remove(index);
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }


}