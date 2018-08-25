import java.util.Scanner;

public class NodeDriver {
    public static void main(String[] args) {

        Node n1 = new Node(1.23, null);
        Node n2 = new Node(2.34, n1);
        Node n3 = new Node(3.45, n1);

        //tests for addNode function
        n3.addNode(n2);

        //test for getNodes and getData
        System.out.println("Node 3 is pointing to 2 other nodes (node 1 and node 2)");
        System.out.println("Node 1's data is " + n3.getNodes().get(0).getData());
        System.out.println("Node 2's data is " + n3.getNodes().get(1).getData());
        System.out.println();

        //test for setData
        System.out.println("what would you like to change Node 1's data to?");
        n1.setData(new Scanner(System.in).nextDouble());
        System.out.println("Node 1's data is " + n3.getNodes().get(0).getData());
        System.out.println("Node 2's data is " + n3.getNodes().get(1).getData());

        //test for removeNode
        n3.removeNode(1);
        System.out.println("Node 3 no longer points to Node 2. Therefore, trying to get its data should break the code");
        System.out.println(n3.getNodes().get(1).getData());
    }
}
