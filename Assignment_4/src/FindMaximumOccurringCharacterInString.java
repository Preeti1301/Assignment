//WAP to find the maximum occurring character in a String.

public class FindMaximumOccurringCharacterInString {

	public static void main(String[] args) {
		String str= "maximum occurring Character";
		maxOccuringchar(str.toLowerCase());
	}
	
	static void maxOccuringchar(String str) {
		char ch=' ';
		int maxCount=0;
		for(int i=0;i<str.length();i++)
		{	int charCount = 1 ;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)) {
					charCount++;
				}
			}
			if(charCount >maxCount) {
				maxCount =charCount;
				ch = str.charAt(i);
			}
		}
		
		System.out.println(maxCount + "  " + ch);
		
	}
}
