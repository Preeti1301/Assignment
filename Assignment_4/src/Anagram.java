import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="anna";
		String str2 = "nada";
		if((ifAnagram( str1.toCharArray(), str2.toCharArray()))) {
			System.out.println("Strings is an anagram");
		}
		else {
			System.out.println("Strings is an not anagram");
		}

	}

	static boolean ifAnagram(char[] str1,char[] str2){
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2)
            return false;
 
        
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
	}

}
