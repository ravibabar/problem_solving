package pro;

import java.util.*;
import java.util.stream.Collectors;

public class Tournament {

	public static void main(String[] args) {

		ArrayList<ArrayList<String>> aList = new ArrayList<ArrayList<String>>();

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("HTML");
		a1.add("C#");
		aList.add(a1);

		
		  ArrayList<String> a2 = new ArrayList<String>(); 
		  a2.add("C#");
		  a2.add("Python"); aList.add(a2);
		  
		  ArrayList<String> a3 = new ArrayList<String>(); 
		  a3.add("Python");
		  a3.add("HTML"); aList.add(a3);
		 
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(0);
		res.add(0);
		res.add(1);

		System.out.println(tournamentWinner(aList, res));

	}
	
	// HTML 0
	// C#   3
	
	// C#   3 

	public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		Iterator<ArrayList<String>> it = competitions.iterator();
		int i = 0;
		while (it.hasNext()) {
			ArrayList<String> list = (ArrayList<String>) it.next();
			String s1 = (String) list.get(0);
			String s2 = (String) list.get(1);

			if (results.get(i) == 0) {
				if(!hm.containsKey(s1)) {
					hm.put(s1,0);
				}
				hm.put(s2,hm.get(s2)!=null && hm.get(s2)!=0 ? hm.get(s2)+3:3);
			} else {
				hm.put(s1,(hm.get(s1)!=null && hm.get(s1)!=0) ? hm.get(s1)+3:3);
				if(!hm.containsKey(s2)) {
				hm.put(s2,0);
				}
			}
			
			
			i++;	
		}
			System.out.println(hm);
		
			String max = Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();
			
			max= hm.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

			
		return max;
	}
}
