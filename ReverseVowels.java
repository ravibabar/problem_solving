package pro;

import java.util.Stack;

public class ReverseVowels  {
	
	public static void main(String[] args) {
		System.out.println(reverseVowels("Leetcode"));
	}
	
    public static String reverseVowels(String s) {
        String str="";
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || 
            s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || 
            s.charAt(i)=='O' || s.charAt(i)=='U'){
                stack.push(s.charAt(i));
            }
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || 
            s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || 
            s.charAt(i)=='O' || s.charAt(i)=='U'){
                str+=stack.pop();
            } else{
                 str+=s.charAt(i);
            }
        }

        return str;
    }
}
