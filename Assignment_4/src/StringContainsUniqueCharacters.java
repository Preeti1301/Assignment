//WAP to find if String contains all unique characters.
public class StringContainsUniqueCharacters {

	public static void main(String[] args) {
		String str= "unique characters";
		if(containUniqueChar(str)) {
			System.out.println("String contains unique charcters");
		}
		else {
			System.out.println("String does not contains unique charcters");

		}
	}
	
	static boolean containUniqueChar(String str) {
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i) ==str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
