package pro;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterMatch {

	public static void main(String[] args) {



		System.out.print(""+generateDocument("betis eht !!s","is the best!!!!"));
	}



	public static boolean generateDocument(String characters, String document) {
		// Write your code here.
		HashMap<Character,Integer> hmd = new HashMap<Character,Integer>();
		for(int i=0;i<document.length();i++){
			if(hmd.containsKey(document.charAt(i))){
				hmd.put(document.charAt(i),hmd.get(document.charAt(i)).intValue()+1);
			}else{
				hmd.put(document.charAt(i),1);
			}
		}

		
		for(Entry<Character,Integer> entry : hmd.entrySet()){
			Character ch = entry.getKey();
		    System.out.println(ch +" document chars "+entry.getValue());
		}
		

		// Write your code here.
		HashMap<Character,Integer> hmc= new HashMap<Character,Integer>();
		for(int i=0;i<characters.length();i++){
			if(hmc.containsKey(characters.charAt(i))){
				hmc.put(characters.charAt(i),hmc.get(characters.charAt(i)).intValue()+1);
			}else{
				hmc.put(characters.charAt(i),1);
			}
		}
		
		for(Entry<Character,Integer> entry : hmc.entrySet()){
			Character ch = entry.getKey();
		    System.out.println(ch +" characters chars "+entry.getValue());
		}
		
		boolean bool = true;
		for(Entry<Character,Integer> entry : hmd.entrySet()){
			Character ch = entry.getKey();
			if(hmc.containsKey(ch) && hmc.get(ch)>=hmd.get(ch)){
				bool= true;
			}else{
				bool=false;
				break;
			}
		}    
		return bool;
	}

}
