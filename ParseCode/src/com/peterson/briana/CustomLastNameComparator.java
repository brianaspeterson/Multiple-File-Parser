package com.peterson.briana;

import java.util.Comparator;


public class CustomLastNameComparator implements Comparator<TextParserClass> {
	
	public int compare(TextParserClass line1, TextParserClass line2){
		if (line1.getLastName().compareTo(line2.getLastName())!=0){
			return line1.getLastName().compareTo(line2.getLastName());
		}
		else {
			return line1.getFirstName().compareTo(line2.getFirstName());
	}

}




	
}
