package com.peterson.briana;

import java.util.Comparator;

public class CustomGenderComparator implements Comparator<TextParserClass> {
		
		public int compare(TextParserClass line1, TextParserClass line2){
			if (line1.getGender().compareTo(line2.getGender())!=0) {
					return line1.getGender().compareTo(line2.getGender());
			}
			else if ((line1.getGender().compareTo(line2.getGender())==0) && (line1.getFirstName().compareTo(line2.getFirstName())==0)){
				return line1.getLastName().compareTo(line2.getLastName());
			}
			else 
				return line1.getFirstName().compareTo(line2.getFirstName());
		
	}
}
			
		

	


