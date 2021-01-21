package hackerranktest;

public class LargestDifferenceBetweenTwoElements {

	public static void main(String[] args) {
		int[] arr = {2,3,10,6,4,8,1} ;
		int n = arr.length ;
		int diff = arr[1] - arr[0];  
	    int curr_sum = diff;  
	    int max_sum = curr_sum;  
	  
	    for(int i = 1; i < n - 1; i++)  
	    {  
	        // Calculate current diff  
	        diff = arr[i + 1] - arr[i];  
	  
	        // Calculate current sum  
	        if (curr_sum > 0)  
	        curr_sum = curr_sum + diff;  
	        else
	        curr_sum = diff;  
	  
	        // Update max sum, if needed  
	        if (curr_sum > max_sum)  
	        max_sum = curr_sum;  
	    } 
	   
	    System.out.println(max_sum);
		
//		int maxDiff = 0 ;
//		int showDiff = 0 ;
//		
//		for(int i = 0 ; i < arr.length ; i++ ) {
//			for(int j = i + 1 ; j < arr.length ; j++) {
//				maxDiff = arr[j] - arr[i] ;
//				if(maxDiff > showDiff) {
//					showDiff = maxDiff ;
//				} else if(maxDiff < 0) {
//					continue ;
//				}
//			}
//		}
//		
//		System.out.println(showDiff);
	}
}
