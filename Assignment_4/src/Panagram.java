
public class Panagram {

	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog";
		
		boolean arr[] =new boolean[26];
		
		int index = 0;
		
		for(int i=0;i<str.length();i++) {
			if ('A' <= str.charAt(i)&& str.charAt(i) <= 'Z')
				index = str.charAt(i) - 'A';
	        else if ('a' <= str.charAt(i)&& str.charAt(i) <= 'z')
	        	index = str.charAt(i) - 'a';
	        else
	            continue;
	       arr[index] = true;	
	   }
		boolean flag=true;
		for (int i = 0; i <= 25; i++) {
            if (arr[i] == false) {
            	System.out.println("String is not a Panagram");
            	flag=false;
                break;
            } 	
		}
		if(flag)
			System.out.println("String is a Panagram");

	}
}
