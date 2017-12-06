package Array;

public class BinarySearchInRotatedArray {
	public int binarySearch(int[] arr, int low, int high, int k)
	{
		while(low<=high){
			int mid = (low+high) /2;
			if(arr[mid] == k){
				return mid+1;
			}
			else if(arr[mid] <= arr[high]){
				if(k >arr[mid] && k<=arr[high]){
					low = mid+1;
				}
				else high = mid-1;
			}
			else{
				if(k < arr[mid] && k >= arr[low]){
					high = mid-1;
				}
				else low = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		BinarySearchInRotatedArray b = new BinarySearchInRotatedArray();
		int[] arr ={12,13,18,21,3,4,5,6};
		System.out.println(b.binarySearch(arr, 0, arr.length-1, 12));
	}
}
