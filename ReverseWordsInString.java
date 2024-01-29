package pro;

import java.util.Stack;

public class ReverseWordsInString {

	public static void main(String[] args) {

		System.out.println(reverseWords("the     sky is blue"));
	}

	public static String reverseWords(String s) {
		String[] sa = s.split("\\s+");
		String newStr = "";
		Stack<String> stack = new Stack<String>();

		for (String str : sa) {
			stack.push(str);
		}
       
		int size=stack.size();
		
		for (int i = 0; i < size; i++) {
			newStr += stack.pop()+" ";
			
		}

		return newStr.trim();
	}
}