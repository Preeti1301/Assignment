
public class SubsetOrNot {

	public static void main(String[] args) {
		int[] arr1 = {};
		int[] arr2 = {2,3,4};
		if(arr2.length<arr1.length && arr2.length != 0 && arr1.length!=0 ) {
			boolean ans = CheckIsSubsetOrNot(arr1,arr2);
			if(ans)
				System.out.println("arr2 is subset of arr1");
			else
				System.out.println("arr2 is not a subset of arr1");
		}
		else if(arr2.length>arr1.length && arr2.length != 0 && arr1.length!=0 ){
			boolean ans = CheckIsSubsetOrNot(arr2,arr1);
			if(ans)
				System.out.println("arr1 is subset of arr2");
			else
				System.out.println("arr1 is not a subset of arr2");
		}
		else {
			if(arr2.length == 0)
				System.out.println("arr2 is of length "+ arr2.length);
			else
				System.out.println("arr1 is of length "+ arr1.length);
		}
			

	}

	static boolean CheckIsSubsetOrNot(int[] arr1, int[] arr2) {
		
		for(int i =0;i<arr2.length;i++) {
			int ans=0;
			for(int j =0;j<arr1.length;j++) {
				if(arr2[i]!=arr1[j])
				{
					ans++;
				}
			}
			if(ans==0)
				return false;
		}
		return true;
	}

}
