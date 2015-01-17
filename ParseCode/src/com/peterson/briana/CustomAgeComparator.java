package com.peterson.briana;

import java.util.Comparator;

public class CustomAgeComparator implements Comparator<TextParserClass> {
	
	public int compare(TextParserClass line1, TextParserClass line2){
		if ((line1.getBirthday().compareTo(line2.getBirthday()))!=0){
			return line1.getBirthday().compareTo(line2.getBirthday());
		}
		else if ((line1.getBirthday().equals(line2.getBirthday()))&&(line1.getFirstName().equals(line2.getFirstName()))){
			return -line1.getLastName().compareTo(line2.getLastName());
		}
		else  {
			return -line1.getFirstName().compareTo(line2.getFirstName());
		}
	
}
}