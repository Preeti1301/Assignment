//WAP to print Duplicates characters from the String.

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//Take the String
		System.out.println("Enter the String:");
		String inputStr = sc.next();
		
		//converting the String to charArray
		char str[] = inputStr.toCharArray();  
		
		removeDuplicate(str);
	
		
	}
	public static void removeDuplicate(char[] str) {
		int length = str.length;
		
		//Creating index variable to use it as index in the modified string   
        int index = 0;   
    
        // Traversing character array  
        for (int i = 0; i < length; i++)   
        {    
       
        	int j;
                
            for ( j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }  
            // If the character is not present before, add it to resulting string   
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
	}
}
