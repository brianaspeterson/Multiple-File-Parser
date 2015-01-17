package com.peterson.briana;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TextParserClass {
	
	private String lastName;
	private String firstName;
	private String middleInitial;
	private String gender;
	private String color;
	private Date birthday;
	
	
	
	public TextParserClass(){
		
	}
	
	public TextParserClass(String str, String array[]) throws ParseException{
		if (str.equals("comma")){
			setLastName(array[0]);
			setFirstName(array[1].substring(1));
			setGender(array[2].substring(1, 2));
			setColor(array[3]);
			setBirthday(formatSlash.parse(array[4].substring(1)));
		}
		else if (str.equals("pipe")){
			setLastName(array[0]);
			setFirstName(array[1].substring(1));
			setMiddleInitial(array[2]);
			setGender(array[3].substring(1, 2));
			setColor(array[4]);
			setBirthday(formatDash.parse(array[5]));
		}
		else if (str.equals("space")){
			setLastName(array[0]);
			setFirstName(array[1]);
			setMiddleInitial(array[2]);
			setGender(array[3].substring(0, 1));
			setBirthday(formatDash.parse(array[4]));
			setColor(array[5]);
			
		}
		
		
		
		
	}
	
	SimpleDateFormat formatSlash = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat formatDash = new SimpleDateFormat("dd-MM-yyyy");

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	

}
