package pro;

public class MergeStringAlternatively {

	public static void main(String[] args) {

		System.out.println(mergeAlternately("abcd","pqrs"));
		
	}


    public static String mergeAlternately(String word1, String word2) {
       int len1=word1.length();
       int len2=word2.length();

       int len = len1<=len2?len1:len2;
       String str="";


       for(int i=0;i<len;i++){
           str+=word1.charAt(i);
           str+=word2.charAt(i);
       }

       if(len1<len2){
        str+=word2.substring(len1,len2);
       } else{
        str+=word1.substring(len2,len1); 
       }
       return str;
    }
    
}
