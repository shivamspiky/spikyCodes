import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;


public class SortByFrequency {

	public void sort(int[] arr) {
		
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
		
		countElements(map,arr);
		System.out.println(map);
		Element[] comArray = new Element[map.keySet().size()];
		int i=0;
		for(Integer a: map.keySet()) {
			comArray[i]=new Element(a,map.get(a));
			i++;
		}
		Arrays.sort(comArray, new Element());
		System.out.println(comArray.toString());
		i=0;
		for(int j=0;j<comArray.length;j++) {
			Element e= comArray[j];
			for(int k=0;k<e.value;k++) {
				arr[i]=e.key;
				i++;
			}
		}
	}
	
	private void countElements(Map<Integer,Integer> map, int[] arr) {
		
		for(int a : arr) {
			Integer element = map.get(a);
			if(element==null) {
				map.put(a,1);
			} else {
				map.put(a,element+1);
			}
		}
	}
	
	public static void main(String[] args) {
		SortByFrequency sortByFrequency = new SortByFrequency();
		int[] arr = {2,5,2,8,5,6,8,8};
		sortByFrequency.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}

class Element implements Comparator<Element>{
	int key;
	int value;
	
	public Element(int a, int b) {
		this.key = a;
		this.value = b;
	}
	public Element(){}
	
	@Override
	public int compare(Element paramT1, Element paramT2) {
		if(paramT1.value > paramT2.value) {
			return -1;
		} else if(paramT1.value < paramT2.value) {
			return 1;
		}else  {
			return 0;
		}
	}
}
