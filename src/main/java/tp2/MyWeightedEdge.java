package tp2;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;

public class MyWeightedEdge extends DefaultEdge {
    private Node departNode;
    private Node arriveNode;
    double weight;
    
    public MyWeightedEdge(Node departNode, Node arriveNode, double weight) {
        super();
        this.departNode = departNode;
        this.arriveNode = arriveNode;
        this.weight = weight;
    }

    public Node getDepartNode() {
        return departNode;
    }

    public void setDepartNode(Node departNode) {
        this.departNode = departNode;
    }

    public Node getArriveNode() {
        return arriveNode;
    }

    public void setArriveNode(Node arriveNode) {
        this.arriveNode = arriveNode;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + getSource() + " : " + getTarget() + " : " + weight + ")";
    }


}
