
public class TrieNode {

	public static final int NO_OF_CHILDREN = 2;
	private TrieNode[] children;
	private boolean isEndOfRow;
	
	public TrieNode(){
		children = new TrieNode[NO_OF_CHILDREN];
		isEndOfRow = false;
	}
	
	public TrieNode[] getChildren() {
		return children;
	}
	public void setChildren(TrieNode[] children) {
		this.children = children;
	}
	public boolean isEndOfRow() {
		return isEndOfRow;
	}
	public void setEndOfRow(boolean isEndOfRow) {
		this.isEndOfRow = isEndOfRow;
	}
	
	public static int boolToIndex(boolean b) {
		if(b) {
			return 1;
		}  else {
			return 0;
		}
	}
	
}
