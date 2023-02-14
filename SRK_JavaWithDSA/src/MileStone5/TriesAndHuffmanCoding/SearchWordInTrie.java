/*Code: Search word in Trie
Send Feedback
Implement the function SearchWord for the Trie class.
For a Trie, write the function for searching a word. Return true if the word is found successfully, otherwise return false.
Note : main function is given for your reference which we are using internally to test the code.
1 indicates insert and 2 indicates search
INput:
1 a
1 ab
1 abcd
2 abcd
2 abc
-1
output:
false
Input2
1 there
1 their
2 the
2 there
2 theres
-1
output:
false
true
false*/
package MileStone5.TriesAndHuffmanCoding;


	class TrieNode{

		char data;
		boolean isTerminating;
		TrieNode children[];
		int childCount;

		public TrieNode(char data) {
			this.data = data;
			isTerminating = false;
			children = new TrieNode[26];
			childCount = 0;
		}
	}


	public class SearchWordInTrie {

		private TrieNode root;
		public int count;
		public SearchWordInTrie() {
			root = new TrieNode('\0');
		}

		public boolean search(String word){
			// Write your code here
			return search(word.toLowerCase(),root);
		}
		public boolean search(String word, TrieNode root){
			if(word.length()==0){
				return  root.isTerminating;
			}
			int childIndex = word.charAt(0)-'a';
			TrieNode child = root.children[childIndex];
			if(child==null){
				return false;
			}
			boolean result = search(word.substring(1),child);
			return result;
		}


		private void add(TrieNode root, String word){
			if(word.length() == 0){
				root.isTerminating = true;
				return;
			}		
			int childIndex = word.charAt(0) - 'a';
			TrieNode child = root.children[childIndex];
			if(child == null){
				child = new TrieNode(word.charAt(0));
				root.children[childIndex] = child;
				root.childCount++;
			}
			add(child, word.substring(1));

		}

		public void add(String word){
			add(root, word);
		}
	}