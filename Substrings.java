package pro;

public class Substrings {

	public static void main(String[] args) {

		
		substr("abcd");
		
	}

	private static void substr(String string) {

		for(int i=0;i<string.length();i++) {
			
			for(int j=i+1;j<=string.length();j++) {
				System.out.println(string.substring(i, j));
			}
			
		}
		
	}

}
