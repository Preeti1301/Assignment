import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {2,5,7,4,1};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int max =maxIndex(arr,0,last);
			swap(arr,max,last);
		}
		
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
	}

	static int maxIndex(int[] arr, int start, int end) {
		int max=start;
		for(int i=start;i<end;i++) {
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}
		
		return max;
	}

}
