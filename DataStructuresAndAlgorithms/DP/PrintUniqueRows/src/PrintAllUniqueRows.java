
public class PrintAllUniqueRows {

	TrieNode head = new TrieNode();
	public void printUniqueRows(boolean[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			if(insert(matrix[i])) {
				printRow(matrix[i]);
			}
		}
	}
	
	private void printRow(boolean[] row) {
		System.out.println();
		for(int i=0;i<row.length;i++) {
			System.out.print(row[i]+"\t");
		}
	}
	
	private boolean insert(boolean[] row) {
		TrieNode node = head;
		boolean flag = false;
		for(int i=0;i<row.length ;i++) {
			if(node.getChildren()[TrieNode.boolToIndex(row[i])] ==null) {
				node.getChildren()[TrieNode.boolToIndex(row[i])] = new TrieNode();
				flag = true;
			}
			
			node=node.getChildren()[TrieNode.boolToIndex(row[i])];
		}
		
		if(!node.isEndOfRow()) {
			node.setEndOfRow(true);
			flag = true;
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		boolean M[][] = {{false, true, false, false, true},
		        {true, false, true, true, false},
		        {false, true, false, false, true},
		        {true, false, true, false, false},
		        {false,true,false,false,true},
		        {true,true,true,false,false}
		    };
		
		PrintAllUniqueRows printAllUniqueRows = new PrintAllUniqueRows();
		printAllUniqueRows.printUniqueRows(M);
	}
}
