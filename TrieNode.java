
import java.util.ArrayList;


public class TrieNode {
	// instance variables
	char data;
	boolean valid;
	int numOfWords;
	ArrayList<TrieNode> children;
	
	// constructors
	public TrieNode(char c) {
	// constructs a new TrieNode with a specific char value
		this.data = c;
		this.valid = false;
		this.numOfWords = 0;
		this.children = new ArrayList<TrieNode>();
	}
	public TrieNode() {
		this.data = data;
		this.valid = false;
		this.numOfWords = 0;
		this.children = new ArrayList<TrieNode>();
	}
	// methods
	public TrieNode getChild(char c) {
		if(this.children.size() == 0) {
			return null;
		}
		else {
			for(int i = 0; i < this.children.size(); i++) {
				if(this.children.get(i).data == c) {
					return this.children.get(i);
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
//		ArrayList<TrieNode> a1 = new ArrayList<TrieNode>();
//		TrieNode root = new TrieNode();
//		TrieNode t1 = new TrieNode('a'); 
//		TrieNode t2 = new TrieNode('b');
//		TrieNode t3 = new TrieNode ('c');
//		TrieNode t4 = new TrieNode('d');
//		TrieNode t5 = new TrieNode('e');
//		TrieNode t6 = new TrieNode('f');
//		TrieNode t7 = new TrieNode('g');
		
//		root.children.add(t1);
//		root.children.add(t2);
//		root.children.add(t3);
		
//		System.out.println(root.getChild('a').data);
	
	}
}



