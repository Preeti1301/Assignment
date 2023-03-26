
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {7,5,2,3,1,4,6};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
			}
		}
		
		for(int e :arr) {
			System.out.print(e +" ");
		}
	}

}
