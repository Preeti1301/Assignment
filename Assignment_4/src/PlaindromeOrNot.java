//WAP to check if �2552� is palindrome or not.

public class PlaindromeOrNot {

	public static void main(String[] args) {
		String str ="2552";
		String strInLowercase =str.toLowerCase();
		
		//1st way
		System.out.println("1st approach");
		String reversedStr="";
		for(int i =str.length()-1;i>=0;i--) {
			reversedStr +=strInLowercase.charAt(i);
		}
		
		if(reversedStr.equals(strInLowercase)) {
			System.out.println("Yes "+ str +" is palindrome");
		}
		else {
			System.out.println("No "+ str +" is palindrome");
		}
		
		
		//2nd way
		System.out.println("2nd approach");
		int i=0;
		int j = strInLowercase.length()-1;
		boolean flag = true;
		while(i<j) {
			if(strInLowercase.charAt(i)!= strInLowercase.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		if(flag) {
			System.out.println("Yes "+ strInLowercase +" is palindrome");
		}
		else {
			System.out.println("No "+ strInLowercase +" is palindrome");
		}
	}
		
}
		


