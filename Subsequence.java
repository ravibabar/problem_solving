package pro;

import java.util.Stack;

public class Subsequence {

	public static void main(String[] args) {

		
		System.out.println(isSubsequence("b","abc"));
		
	}
	
	
	public static boolean isSubsequence(String s, String t) {
        Stack<Character> st = new Stack<Character>();
        boolean b=false;
        
        if(s.equals("")) {
        	b=true;
        	return b;
        }

        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        int size=st.size();
        for(int i=t.length()-1;i>=0;i--){
            Character ch= st.peek();
            if(ch==t.charAt(i)){
                size--;
                st.pop();
                if(size==0 && i!=0){
                    b=true;
                    return b;
                }
            }
        }
        if(size==0){
            b=true;
        }
        return b;
    }

}
