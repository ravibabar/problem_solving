package pro;

public class MaximumAvgSubarray {

	public static void main(String[] args) {

		int arr[] ={-1};
		int kk=1;
		System.out.println(findMaxAverage(arr,kk));
		
	}
	
	
	public static double findMaxAverage(int[] nums, int k) {
        
	    double avg=0.0;
	    if(k==1 && nums.length==1) {
	    	avg=nums[0];
	    }
	    
	        for(int i=0;i<=nums.length-k;i++){
	            double sum=0.0;
	            for(int j=0;j<k;j++){
	                sum=sum+nums[i+j];
	            }
	            double curavg=(double)sum/k;
                if(curavg>avg){
                    avg=curavg;
                }
	        }
	        return avg;
	    }

}
