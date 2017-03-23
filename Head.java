import java.util.Vector

//this is an abstract class for my messaging and locating apps. The head is at the top of the tree, and nodes will extend //this. A head does not have to know a location because it knows where it is at; it can possibly share a location if it so decides.

abstract public class Head {

	private Vector<Node> nodes;
	private Boolean shareLocation;
	private Boolean receiveMessages;

	public Head {
		shareLocation = false;
		receiveMessages = false;
	}

	public void addNode (Node nd) { nodes.add(nd); }

	//to delete properly, you would have to add some sort of key and make sure you are deleting the right node
	public void deleteNode (Node nd) {nodes.remove(nd);}

	public void allowCommunication() { receiveMessages = true;}
	public void allowLocation(){ shareLocation = true; }

}

