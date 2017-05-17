import java.util.Arrays;

public class BuildingBridges {
	
	public int maxBridges(int[] arr) {
		
		int[] LIS = new int[arr.length];
		LIS[0]=1;
		for(int i=1;i<arr.length;i++) {
			int max = 0;
			for(int j=i-1;j>=0;j--) {
				
				if(arr[j] < arr[i] && LIS[j] > max) {
					max = LIS[j];
				}
			}
			
			LIS[i]=max+1;
		}
		
		return findMax(LIS);
	}
	
	private int findMax(int[] LIS) {
		int max = LIS[0];
		
		for(int i=1;i<LIS.length;i++) {
			
			if(LIS[i] > max) {
				max = LIS[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		RiverSlot[] river = new RiverSlot[4];
		river[0] = new RiverSlot(4,1);
		river[1] = new RiverSlot(1,3);
		river[2] = new RiverSlot(3,4);
		river[3] = new RiverSlot(2,2);
		
		Arrays.sort(river);
		BuildingBridges buildingBridges = new BuildingBridges();
		
		System.out.println(buildingBridges.maxBridges(getSecondBank(river)));
	}
	
	private static int[] getSecondBank(RiverSlot[] river) {
		
		int[] arr = new int[river.length];
		
		for(int i=0;i<river.length;i++) {
			arr[i]=river[i].first;
		}
		
		return arr;
	}
}

class RiverSlot implements Comparable<RiverSlot> {
	int first;
	int second;
	
	public RiverSlot(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public int compareTo(RiverSlot slot) {
		return this.second-slot.second;
	}
}
