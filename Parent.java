import java.util.Vector;

//This is the parent class for the child locating app
class Parent {

	//we create a vector of children. This vector is the only element of the class
	private Vector<Child> myChildren = new Vector<Child>;
	
	//***this method adds a child to the vector. Have to figure out where to use this; main would be the interface
	public void addChild(Child plusChild){
		myChildren.add(plusChild);
	}
	
	//this method iterates through all the children in the vector and gives all locations
	//***try using an iterator instead
	public void listChildrenLocation(){
		for (int i = 0; i < myChildren.size(); i++){
			Child placeHolder = myChildren.get(i);
			//for right now we just show coordinates. This app is meant to be displayed on a google map
			System.out.println(placeHolder.getName() + ": " + placeHolder.showLocation();
		}
	}
	
}
		