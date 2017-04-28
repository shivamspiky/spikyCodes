
public class MaxSumRectangleIn2DMatrix {

	public int maxSum(int[][] matrix) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<matrix[0].length;i++) {
			int[] arr = new int[matrix.length];
			for(int j=i;j<matrix[0].length;j++) {
				
				
				for(int k=0;k<arr.length;k++) {
					arr[k]+=matrix[k][j];
				}
				
				int temp = maxSumContigousSubArray(arr);
				if(temp > max) {
					max = temp;
				}
			}
		}
		
		return max;
	}
	
	private int sum(int[][] matrix, int i, int j, int k) {
		int sum =0;
		for(int l=i;l<=j;l++) {
			sum+=matrix[k][l];
		}
		
		return sum;
	}
	
	private int maxSumContigousSubArray(int[] arr) {
		int max = arr[0];
		int current_max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			//current_max ending at i
			current_max = Math.max(arr[i],arr[i]+current_max);
			max = Math.max(current_max,max);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, -1, -4, -20},
            {-8, -3, 4, 2, 1},
            {3, 8, 10, 1, 3},
            {-4, -1, 1, 7, -6}
           };
		
		MaxSumRectangleIn2DMatrix maxSumRectangleIn2DMatrix = new MaxSumRectangleIn2DMatrix();
		System.out.println(maxSumRectangleIn2DMatrix.maxSum(matrix));
	}
}
