public class SortedArrayToBalancedBST {

	public TreeNode convert(int[] arr,int start, int end) {
		
		if(start > end) {
			return null;
		}
		int mid = start + (end-start)/2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = convert(arr,start,mid - 1);
		root.right = convert (arr,mid + 1, end);
		return root;
	}
	
	public void inorder(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print( root.data + " ");
		inorder(root.right);
	}
	
	public static void main(String[] args) {
		SortedArrayToBalancedBST sortedArrayToBalancedBST = new SortedArrayToBalancedBST();
		int[] arr = {1,2,3,4,5,11,19,21,23,35};
		sortedArrayToBalancedBST.inorder(sortedArrayToBalancedBST.convert(arr, 0, arr.length-1));
	}
}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
	}
}

