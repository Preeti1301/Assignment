//WAP to count the number of consonants, vowels, special characters in a String.
public class CountVowelConsonantsSpecialCharsInString {

	public static void main(String[] args) {
		String str = "geeks for geeks121";
		int vowels = 0;
		int consonants = 0;
		int specialChars = 0;
		int i=0;
		
		while(i<(str.length())) {
			char ch = str.charAt(i);
			if((ch >= 'a' && ch <= 'z') ||  (ch >= 'A' && ch <= 'Z') ) {
				ch = Character.toLowerCase(ch);
				 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		             vowels++;
				 else
					 consonants++;
			}
			else if ((ch <= '0') && (ch >= '9'))
                specialChars++;
			i++;
		}
		
		System.out.println("Vowels = "+vowels +"    consonants = "+consonants + "      special character = " +specialChars);
	}

}
