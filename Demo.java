package pro;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {

		
		String str="aaabbcccdddd";
		
		getNumberOfchars(str);
	}

	private static void getNumberOfchars(String str) {

		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		
		
		for(int i=0;i<str.length();i++) {

			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry : hm.entrySet()) {
		
			System.out.print(""+entry.getKey()+entry.getValue());
		}
		
	}

}
