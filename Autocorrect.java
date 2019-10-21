
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Autocorrect {

	public static void main(String[] args) throws FileNotFoundException {
		File auto = new File("/Users/tammieoh/Desktop/wordsEn.txt"); 
		Scanner sc = new Scanner(auto); 
		TrieTree t1 = new TrieTree();
		while(sc.hasNextLine()) {
			String s1 = sc.nextLine();
		    t1.insert(s1);
		  } 		
		System.out.println("Enter a sentence: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		input = input.replaceAll("\\p{Punct}", "");
		String[] a1 = input.split(" ");
		String output = "";
		for(int i = 0; i < a1.length; i++) {
			if(t1.search(a1[i])) {
				output += a1[i] + " ";
			}
			else {
				output += t1.wordListForWord(a1[i]) + " ";
			}
		}
		System.out.println(output);
		}
}
