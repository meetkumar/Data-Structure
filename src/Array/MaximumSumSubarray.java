//Find maximum sum from array along with indicies

package Array;

public class MaximumSumSubarray {
	
	public void maxSum(int[] arr){
		int max_sum_so_far=0, local_sum=0;
		int start = 0, s = 0, end = 0;
		for(int i=0;i<arr.length;i++){
			local_sum = local_sum + arr[i];
			if(local_sum > max_sum_so_far){
				max_sum_so_far = local_sum;
				start = s;
				end =i;
			}
			if(local_sum < 0){
				local_sum =0;
				s=i+1;
			}
		}
		System.out.println("Indicies from "+start+" to "+end+" has maximum sum of "+max_sum_so_far);
	}
	
	public static void main(String[] args){
		MaximumSumSubarray m = new MaximumSumSubarray();
		int[] arr ={12,13,-1,-50, 100, 12};
		m.maxSum(arr);
	}
}
