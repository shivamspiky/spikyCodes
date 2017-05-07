import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class SortByFrequency {

	public void sort(int[] arr) {
		
		/*There is no guarantee about sorting algorithm of Arrays
		 * it it is QuickSort it will disturb the stability that's why
		 * maintain the stability using index in comparator*/
		HashMap<Integer,Element> map = new HashMap<Integer, Element>();
		
		countElements(map,arr);
		//System.out.println(map);
		Element[] comArray = new Element[map.keySet().size()];
		int i=0;
		for(Integer a: map.keySet()) {
			comArray[i]=new Element(a,map.get(a).value,map.get(a).index);
			i++;
		}
		Arrays.sort(comArray);
		//System.out.println(comArray.toString());
		i=0;
		for(int j=0;j<comArray.length;j++) {
			Element e= comArray[j];
			for(int k=0;k<e.value;k++) {
				arr[i]=e.key;
				i++;
			}
		}
	}
	
	private void countElements(Map<Integer,Element> map, int[] arr) {
		int i=0;
		for(int a : arr) {
			
			Element element = map.get(a);
			if(element==null) {
				map.put(a,new Element(a,1,i));
			} else {
				map.put(a,new Element(a,element.value+1,i));
			}
			i++;
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

class Element implements Comparable<Element>{
	int key;
	int value;
	int index;
	
	public Element(int a, int b, int c) {
		this.key = a;
		this.value = b;
		this.index = c;
	}
	public Element(){}
	
	@Override
	public int compareTo(Element paramT2) {
		if(paramT2.value - this.value==0) {
			return this.index-paramT2.index;
		} 
		return paramT2.value-this.value;
	}
}
