package pro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonElementsArray {

	public static void main(String[] args) {

		
		int[] ar1= {2,5,7,1,9};
		int[] ar2 = {3,5,1,4,9};
		
		List<Integer> list= getIntersection(ar1,ar2);
		list.stream().forEach(System.out::println);
	}

	private static List<Integer> getIntersection(int[] ar1, int[] ar2) {

		
		HashSet<Integer> hs= new HashSet<Integer>();
		List<Integer> ll=new ArrayList<Integer>();
		
		for(int i:ar1) {
			hs.add(i);
		}
		
		for(int i:ar2) {
			if(hs.contains(i)) {
				ll.add(i);
			}
		}
		
		return ll;
	}

}
