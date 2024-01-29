package pro;

import java.util.*;
import java.util.stream.*;

public class Streams {

	public static void main(String[] args) {
		

        List<String> g = Arrays.asList("12345", "121212124584", "121212122467", "237896", "235", "45345", "356454564",
				"090", "64367");
		String g9Countries = g.stream().filter(x -> x.length() == 12).map(x -> x.substring(0, 4) + "****")
				.collect(Collectors.joining(", "));
         
       //System.out.println(g9Countries);
       //Math.abs(0)
       
       HashMap<String, String> hm =new HashMap<String, String>();
       hm.put(g9Countries, g9Countries);
       hm.forEach((k,v)-> {
    	   System.out.println(k+" "+v);
       });
       
     
       
	}

}
