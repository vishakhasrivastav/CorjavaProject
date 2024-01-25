package classAndObject;
/*
 * this represents the current class object. Meaning it represents the object
 * of the class in which we are using this keyword.
 */

class Tree{
	
	int treeId;
	String treeName;
	String treeType;
	
	public Tree() {}
	
	public Tree(int treeId, String treeName, String treeType) {
		
		this.treeId=treeId;
		this.treeName=treeName;
		this.treeType=treeType;
	}
	
	public void display() {
		
		System.out.println("Tree id: "+treeId);
		System.out.println("Tree name: "+treeName);
		System.out.println("Tree type: "+treeType);
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		
		
Tree t=new Tree(10, "Banyan Tree", "Evergreen type");
t.display();

Tree t2=new Tree(11, "Coconut tree", "Palm type");
t2.display();


	}

}
