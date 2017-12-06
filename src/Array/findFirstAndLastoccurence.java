//Find first and last occurence of element in Sorted Array

package Array;

public class findFirstAndLastoccurence {
	
	private int first;
	private int last;
	
	public void firstOccurence(int[] arr,int start, int end, int k){
		while(start<end){
			int mid = (start+end)/2;
			if(arr[mid] == k){
				first = mid+1;
				end = mid-1;
			}
			else if (arr[mid] < k){
				start = mid+1;
			}
			else if (arr[mid] > k){
				end = mid-1;
			}
		}
	}
	
	public void lastOccurence(int[] arr,int start, int end, int k){
		while(start<end){
			int mid = (start+end)/2;
			if(arr[mid] == k){
				last = mid+1;
				start = mid+1;
			}
			else if (arr[mid] < k){
				start = mid+1;
			}
			else if (arr[mid] > k){
				end = mid-1;
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr={1,2,4,5,6,10,10,10,10,11};
		findFirstAndLastoccurence f = new findFirstAndLastoccurence();
		f.firstOccurence(arr,0,arr.length-1,10);
		System.out.println("First Occurence of 10 is : "+f.first);
		f.lastOccurence(arr, 0, arr.length-1, 10);
		System.out.println("Last Occurence of 10 is :" +f.last);
	}
}
