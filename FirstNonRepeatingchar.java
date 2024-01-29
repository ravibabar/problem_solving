package pro;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingchar {

	public static void main(String[] args) {

		String string = "faadabcbbebdf";

	/*	String sb = new String();
		int index = -1;

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);

			if (sb.contains("" + ch)) {
			} else {
				sb += ch;
			}

		}
		if (sb.length() > 0)
			index = string.indexOf(sb.charAt(0));
		
		System.out.println(index);*/
		
		
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		int index=-1;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()==1) {
				//System.out.println(string.indexOf(entry.getKey()));
				index=string.indexOf(entry.getKey());
				break;
			}
		}
		
	}

}
