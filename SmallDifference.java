package pro;

import java.util.Arrays;

public class SmallDifference {

	public static void main(String[] args) {

		int[] arrayOne={-1, 5, 10, 20, 3};
		int[] arrayTwo= {26, 134, 135, 15, 17};
		
		
		int[] a= get(arrayOne, arrayTwo);
		System.out.println(a[0] +" "+ a[1]);
		
	}

	
	
	public static int[] get(int[] arrayOne, int[] arrayTwo) {
		
		

	    // Write your code here.

	    Arrays.sort(arrayOne);
	    Arrays.sort(arrayTwo);
	    int smalldiff= Integer.MAX_VALUE;
	    int[] arr=new int[2];
	    int pointerone=0;
	    int pointertwo=0;

	    while(pointerone <arrayOne.length && pointertwo <arrayTwo.length ){

	    int newdiff = Math.abs(arrayOne[pointerone]-arrayTwo[pointertwo]);
	      
	    if( newdiff < smalldiff ){
	      arr[0]=arrayOne[pointerone];
	      arr[1]=arrayTwo[pointertwo];
	      smalldiff = newdiff ;
	    }
	      if(arrayOne[pointerone]<arrayTwo[pointertwo]){
	      pointerone++;
	        
	      }else{
	        pointertwo++;
	      }
	      
	    }
	    
	    return arr;
	  }
		
}
