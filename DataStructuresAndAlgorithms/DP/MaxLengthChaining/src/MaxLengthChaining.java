
public class MaxLengthChaining {
	
	public int maxLength(Chain[] arr) {
		
		if(arr==null || arr.length==0) {
			return 0;
		}
		
		int[] MAX= new int[arr.length];
		
		for(int i=1;i<arr.length;i++) {
			int max = 1;
			for(int j=i-1;j>=0;j--) {
				
				if(arr[j].secondNode < arr[i].firstNode && MAX[j] > max) {
					max=MAX[j];
				}
			}
			
			MAX[i]=1+max;
		}
		
		return findMax(MAX);
		
	}
	
	private int findMax(int[] arr) {
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Chain chain1 =new Chain(5,24);
		Chain chain2 = new Chain(39,60);
		Chain chain3 = new Chain(15,28);
		Chain chain4 = new Chain(27,40);
		Chain chain5 = new Chain(50,90);
		
		Chain[] arr = new Chain[5];
		arr[0]=chain1;
		arr[1]=chain2;
		arr[2]=chain3;
		arr[3]=chain4;
		arr[4]=chain5;
		
		MaxLengthChaining maxLengthChaining = new MaxLengthChaining();
		
		System.out.println(maxLengthChaining.maxLength(arr));
		
		
	}
}

class Chain{
	int firstNode;
	int secondNode;
	
	public Chain(int firstNode, int secondNode) {
		this.firstNode = firstNode;
		this.secondNode = secondNode;
	}
	
}
