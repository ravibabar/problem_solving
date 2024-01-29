package pro;

import java.util.stream.Stream;

public class ArrayDemo {

	public static void main(String[] args) {

		
		char[] ch= {'a','b','y','n','s','i','h'};
		
		int i=0;
		for(char c:ch) {
			if(i%2!=0) {
				ch[i]=Character.toUpperCase(c);
			}
		
			
			i++;
			
		}
		
		Stream.of(ch).forEach(System.out::println);
		
	}

}
