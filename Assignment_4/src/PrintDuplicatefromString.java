//WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
public class PrintDuplicatefromString {

	public static void main(String[] args) {
		 String string1 = "Find duplicates";  
	        int count;  
	          
	        //Converts given string into character array  
	        char string[] = string1.toCharArray();  
	          
	        System.out.println("Duplicate characters ");  
	        //Counts each character present in the string  
	        for(int i = 0; i <string.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <string.length; j++) {  
	                if(string[i] == string[j] && string[i] != ' ') {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }
	          
	            if(count > 1 && string[i] != '0')  
	                System.out.println(string[i]);  
	        
	
        }  

	}

}
