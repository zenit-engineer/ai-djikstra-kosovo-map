/*Kjo klase modelon lidhet mes nyjeve pra lidhjet mes qyteteve
  pra pesha e lidhjet edhe pika e burimit dhe destinacionit
 */
public class Edge {
	
	private double weight;
	private Node startNode;
	private Node endNode;
	
	public Edge (double weight, Node startNode, Node endNode) {
		this.weight = weight;
		this.startNode = startNode;
		this.endNode = endNode;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Node getStartNode() {
		return startNode;
	}

	public void setStartNode(Node startNode) {
		this.startNode = startNode;
	}

	public Node getEndNode() {
		return endNode;
	}

	public void setEndVertex(Node endNode) {
		this.endNode = endNode;
	}
	
	
}
