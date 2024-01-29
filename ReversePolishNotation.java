package pro;

import java.util.*;

public class ReversePolishNotation {
  public static int reversePolishNotation(String[] tokens) {
    // Write your code here.

    int res=-1;

    Stack<String> st =new Stack<String>();
    for(int i=0;i<tokens.length;i++){
      if((tokens[i].equals("+")) || (tokens[i].equals("-")) || (tokens[i].equals("*")) || (tokens[i].equals("/"))){
        
    		  String x=st.pop();
    		  String y= st.pop();
    		  char op =tokens[i].charAt(0);
    		  st.push(""+apply(x,y,op));
    	  
      } else {
        st.push(tokens[i]);
      }
    }
     
    
    return Integer.parseInt(st.peek());
  }
  
  private static int apply(String x, String y, char op) {
	// TODO Auto-generated method stub
	  switch(op){
	  
	  case '+': 
		  return Integer.parseInt(x) + Integer.parseInt(y);
		  

	  case '-': 
		  return Integer.parseInt(y) - Integer.parseInt(x);
		  

	  case '*': 
		  return Integer.parseInt(x) * Integer.parseInt(y);
		  

	  case '/': 
		  return Integer.parseInt(y) / Integer.parseInt(x);
		  
	  }
	return 0;
	
}

public static void main(String[] args) {
	  String s[]= {"50","3","17","+","2","-","/"};
	  System.out.println(reversePolishNotation(s));
}
  
  // 50 3 17 2
  
  
}
