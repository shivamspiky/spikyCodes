
public class BinaryTreeToCircularDLLConvertion {

	public TreeNode convert(TreeNode head) {
		if(head==null) {
			return head;
		}
		
		TreeNode leftHead=null,rightHead=null;
		
		if(head.left!=null) {
			leftHead = convert(head.left);
		}
		
		if(head.right!=null) {
			rightHead = convert(head.right);
		}
		
		head.left=head;
		head.right = head;
		
		head = add(leftHead,head);
		head = add(head,rightHead);
		
		return head;
	}
	
	private TreeNode add(TreeNode head1, TreeNode head2) {
		
		if(head1==null) {
			return head2;
		}
		
		if(head2==null) {
			return head1;
		}
		
		head1.left.right=head2;
		TreeNode tail2=head2.left;
		head2.left = head1.left;
		head1.left = tail2;
		tail2.right=head1;
		
		return head1;
	}
	
	// Display Circular Link List
    public void display(TreeNode head)
    {
        System.out.println("Circular Linked List is :");
        TreeNode itr = head;
        do
        {
            System.out.print(itr.data+ " " );
            itr = itr.right;
        }
        while (itr != head);
        System.out.println();
    }
	
	public static void main(String[] args) {
		TreeNode root  ;
        root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(25);
        root.left.right = new TreeNode(30);
        root.right.left = new TreeNode(36);
 
        BinaryTreeToCircularDLLConvertion binaryTreeToCircularDLLConvertion = new BinaryTreeToCircularDLLConvertion();
        
        // head refers to the head of the Link List
        TreeNode head = binaryTreeToCircularDLLConvertion.convert(root);
 
        // Display the Circular LinkedList
        binaryTreeToCircularDLLConvertion.display(head);
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
