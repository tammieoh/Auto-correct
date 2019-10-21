

import java.util.ArrayList;

public class TrieTree {
	// instance variables
	TrieNode root;
	// constructors
	public TrieTree() {
		this.root = new TrieNode(' ');
	}
	// methods
	public void insert(String word) {
		TrieNode current = this.root;
		for(int i = 0; i < word.length(); i++) {
			if(current.getChild(word.charAt(i)) == null) {
				TrieNode t1 = new TrieNode(word.charAt(i));
				current.children.add(t1);
				current = current.getChild(word.charAt(i));
				if(i == word.length() - 1) {
					current.valid = true;
				}
			}
			else {
				current = current.getChild(word.charAt(i));
				if(i == word.length() - 1) {
					current.valid = true;
					break;
				}
			}
		}
	}
	public void remove(String word) {
		TrieNode current = this.root;
		for(int i = 0; i < word.length(); i++) {
			if(current.getChild(word.charAt(i)) == null) {
				System.out.println("This word does not exist.");
				break;
			}
			else {
				current = current.getChild(word.charAt(i));
				if(i == word.length() - 1) {
					current.valid = false;
					System.out.println(word.toUpperCase() + " has been removed.");
				}
			}
		}
	}
	public boolean search(String word) {
		boolean isValid = false;
		TrieNode current = this.root;
		for(int i = 0; i < word.length(); i++) {
			if(current.getChild(word.charAt(i)) == null) {
				return false;
			}
			else {
				if(current.getChild(word.charAt(i)).data == word.charAt(i)) {
					current = current.getChild(word.charAt(i));
					if(i == word.length() - 1) {
						if(current.valid == true) {
							isValid = true;
						}
					}
				}
			}
		}
		return isValid;
	}
	public ArrayList<String> wordListForWord(String word) {
		TrieNode current = this.root;
		ArrayList<String> recommend = new ArrayList<String>();
			for(int i = 0; i < word.length() - 1; i++) {  
				if(this.search(word)) {
					return recommend;
				}
				if(current.getChild(word.charAt(i)) != null) {
					current = current.getChild(word.charAt(i));
				}
				else {
					return recommend;
				}
			}
			for(int i = 0; i < current.children.size(); i++) {
				if(current.children.get(i).valid == true) {
					word = word.substring(0, word.length() - 1);
					word += current.children.get(i).data;
					if(this.search(word) == true) {
						recommend.add(word);
					}
				}
			}
		return recommend;
	}
	public static void main(String[] args) {
//		TrieTree s1 = new TrieTree();
//		s1.insert("apple");
//		s1.insert("banana");
//		s1.insert("abaci");
//		s1.insert("abace");
//		s1.insert("hello");
//		s1.insert("there");
//		s1.insert("something");
//		s1.insert("called");
//		s1.insert("caller");
//		s1.insert("hells");
//		System.out.println(s1.search("apple"));
//		System.out.println(s1.search("banana"));
//		System.out.println(s1.wordListForWord("callet"));
//		s1.remove("banana");
//		s1.search("callet");
		}
}
