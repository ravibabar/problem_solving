package pro;

import java.util.ArrayList;
import java.util.List;

public class MoveToEndElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		
		int toMo=2;
		System.out.println(moveElementToEnd(list,toMo));

	}
	
	
	
	
	public static List<Integer> moveElementToEnd(
		    List<Integer> array, int toMove
		  ) {
		    // Write your code here.

		// 2,1,2,2,2,3,4,2
		// 4,1,2,2,2,3,2,2
		// 4,1,2,2,2,3,2,2
		int i=0;
		    
		int j=array.size()-1;

		    while(i<j){


		      while(i<j && array.get(j)==toMove){
		        j=j-1;
		      }
		      if(array.get(i)==toMove){
		        swap(i,j,array);
		        } 
		      i++;

		    }
		    
		    return array;
		  }

		  static void swap(int i,int j,List<Integer> array){
		    int temp = array.get(i);
		    array.set(i,array.get(j));
		    array.set(j,temp);
		 }
		}

