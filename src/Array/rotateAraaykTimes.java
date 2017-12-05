//right rotate array k times e.g. arr=[1,2,4,5,6,7] k =2  arr = [6,7,1,2,4,5] 
package Array;

public class rotateAraaykTimes {
	public static void rotate(int[] arr, int start, int end){
		while(start < end){
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args){
		int[] arr ={1,2,4,5,6,7};
		int k=2;
		//Reverse whole array
		rotate(arr,0,arr.length-1);
		 
		//Reverse k-elements
		rotate(arr, 0, k-1);
		
		//Reverse n-k elements
		rotate(arr, k,arr.length-1);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
