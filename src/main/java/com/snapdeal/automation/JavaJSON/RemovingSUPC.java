package com.snapdeal.automation.JavaJSON;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemovingSUPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String alreadyAttachedSUPC = "['SDL990837346','SDL251441889','SDL468606237']" ;
		//String alreadyAttachedSUPC = "['SDL251441889', 'SDL990837346', 'SDL468606237']" ;
		//String alreadyAttachedSUPC = "['SDL990837346', 'SDL468606237', 'SDL251441889']" ;
		String alreadyAttachedSUPC = "['SDL251441889']" ;
		//String alreadyAttachedSUPC = "['SDL990837346', 'SDL468606237']" ;
		
		// Use Matcher class of java.util.regex 
        // to match the character 
        Matcher matcher = Pattern.compile(String.valueOf(',')).matcher(alreadyAttachedSUPC); 
  
        int res = 0; 
  
        // for every presence of character ch 
        // increment the counter res by 1 
        while (matcher.find()) { 
            res++; 
        }
        
		System.out.println("Count of comma : " + res);
        
		if(alreadyAttachedSUPC.contains("'SDL251441889'")) {
			if(res == 0) {
				System.out.println(alreadyAttachedSUPC.replace("['SDL251441889']", "null")) ;
			} else if(alreadyAttachedSUPC.matches(".*,\\s*?'SDL251441889'.*")) {
				System.out.println("If");
				System.out.println(alreadyAttachedSUPC.replaceAll(",\\s*?'SDL251441889'", "")) ;
			} else if(alreadyAttachedSUPC.matches(".*'SDL251441889',\\s*?.*")) {
				System.out.println("Else");
				System.out.println(alreadyAttachedSUPC.replaceAll("'SDL251441889',\\s*?", "")) ;
			}
		} else {
			System.out.println("Bye");
		}
	}

}
