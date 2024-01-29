package pro;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {

	public static void main(String[] args) {

		int extra=3;
		int[] candies= {2,3,5,1,3};
		List ll=kidsWithCandies(candies,extra);
		System.out.println(ll);
		
	}
	
	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	       
		 int max=candies[0];
		 
		 List<Boolean> list = new ArrayList<Boolean>();
		 for(int candi: candies)
		 {
			 if(candi > max) {
				 max=candi;
			 }
		 }
		 
		 for(int candi : candies) {
		
			 int add =candi+extraCandies;
			 if(add>= max) {
				 list.add(true);
			 }else {
				 list.add(false);
			 }
		 }
		 
		 return list;
		 
	    }

}
