package com.peterson.briana;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.peterson.briana.TextParserClass;
/****************************
 * 
 * 
 * 
 * Last Name, First Name, Middle Initial, Gender(M or F), Birthday(MM/DD/YYYY)
 * 
 * 
 * 
 * 
 * @author brianapeterson
 *
 */

public class TextParserMain {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader fileText = null;
		TreeMap<TextParserClass, TextParserClass> sortByLastName = new TreeMap<TextParserClass, TextParserClass>(new CustomLastNameComparator());
		TreeMap<TextParserClass, TextParserClass> sortByGender = new TreeMap<TextParserClass, TextParserClass>(new CustomGenderComparator());
		TreeMap<TextParserClass, TextParserClass> sortByAge = new TreeMap<TextParserClass, TextParserClass>(new CustomAgeComparator());
		
		
		
		try {
			
			File dir = new File("parse-sort/input");
			for (File file : dir.listFiles()){
				
				String line;
				fileText = new BufferedReader(new FileReader(file));
				
				while ((line = fileText.readLine()) != null)
				{
					
					if (line.contains(",")){
						
						for (int i =0; i<line.length(); i++)
						{
							TextParserClass lineArray = commaLinesParser(line);
							switch (i){
							case 0: 
								TextParserClass commaFileLineOne = lineArray;
								sortByLastName.put(commaFileLineOne , commaFileLineOne);
								sortByGender.put(commaFileLineOne, commaFileLineOne);
								sortByAge.put(commaFileLineOne, commaFileLineOne);
								
								break;
							case 1:
								TextParserClass commaFileLineTwo = lineArray;
								sortByLastName.put(commaFileLineTwo, commaFileLineTwo);
								sortByGender.put(commaFileLineTwo, commaFileLineTwo);
								sortByAge.put(commaFileLineTwo, commaFileLineTwo);
								
								break;
							case 2:  
								TextParserClass commaFileLineThree = lineArray;
								sortByLastName.put(commaFileLineThree, commaFileLineThree);
								sortByGender.put(commaFileLineThree, commaFileLineThree);
								sortByAge.put(commaFileLineThree, commaFileLineThree);
								
								break;
							}
							
						}
					
					}
					
					else if (line.contains("|")){
						
						for (int i =0; i<line.length(); i++)
						{
							TextParserClass lineArray = pipeLinesParser(line);
							switch (i){
							case 0: 
								TextParserClass pipeFileLineOne = lineArray;
								sortByLastName.put(pipeFileLineOne, pipeFileLineOne);
								sortByGender.put(pipeFileLineOne, pipeFileLineOne);
								sortByAge.put(pipeFileLineOne, pipeFileLineOne);
								
								break;
							case 1: 
								TextParserClass pipeFileLineTwo = lineArray;
								sortByLastName.put(pipeFileLineTwo, pipeFileLineTwo);
								sortByGender.put(pipeFileLineTwo, pipeFileLineTwo);
								sortByAge.put(pipeFileLineTwo, pipeFileLineTwo);
								
								break;
							case 2: 
								TextParserClass pipeFileLineThree = lineArray;
								sortByLastName.put(pipeFileLineThree, pipeFileLineThree);
								sortByGender.put(pipeFileLineThree, pipeFileLineThree);
								sortByAge.put(pipeFileLineThree, pipeFileLineThree);
								
								break;
							}
						}
					}
					else if (line.contains(" ")){
						
						for (int i =0; i<line.length(); i++)
						{
							TextParserClass lineArray = spaceLinesParser(line);
							switch (i){
							case 0: 
								TextParserClass spaceFileLineOne = lineArray;
								sortByLastName.put(spaceFileLineOne, spaceFileLineOne);
								sortByGender.put(spaceFileLineOne, spaceFileLineOne);
								sortByAge.put(spaceFileLineOne, spaceFileLineOne);
								
								break;
							case 1: 
								TextParserClass spaceFileLineTwo = lineArray;
								sortByLastName.put(spaceFileLineTwo, spaceFileLineTwo);
								sortByGender.put(spaceFileLineTwo, spaceFileLineTwo);
								sortByAge.put(spaceFileLineTwo, spaceFileLineTwo);
								
								break;
							case 2: 
								TextParserClass spaceFileLineThree = lineArray;
								sortByLastName.put(spaceFileLineThree, spaceFileLineThree);
								sortByGender.put(spaceFileLineThree, spaceFileLineThree);
								sortByAge.put(spaceFileLineThree, spaceFileLineThree);
								
								break;
							}
						}
					}
				}
				
			}

		
				for (Map.Entry<TextParserClass, TextParserClass> entry : sortByLastName.entrySet())
				{
				    System.out.println(entry.getValue().getLastName() + "," + entry.getValue().getFirstName() + "," + entry.getValue().getMiddleInitial() +
				    		"," + entry.getValue().getGender() + "," + entry.getValue().getBirthday());
				}
			    System.out.println("--------------------------------------------");

				for (Map.Entry<TextParserClass, TextParserClass> entry : sortByGender.entrySet())
				{
				    System.out.println(entry.getValue().getLastName() + "," + entry.getValue().getFirstName() + "," + entry.getValue().getMiddleInitial() +
				    		"," + entry.getValue().getGender() + "," + entry.getValue().getBirthday());
				}
			    System.out.println("--------------------------------------------");
			    for (Map.Entry<TextParserClass, TextParserClass> entry : sortByAge.entrySet())
				{
				    System.out.println(entry.getValue().getLastName() + "," + entry.getValue().getFirstName() + "," + entry.getValue().getMiddleInitial() +
				    		"," + entry.getValue().getGender() + "," + entry.getValue().getBirthday());
				}


		}
		
		catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						fileText.close();
					}
					catch (IOException e) {
						e.printStackTrace();
					}
				}
		}
	
public static TextParserClass commaLinesParser(String word) throws Exception{
		String[] indivWords = word.split(",");
		TextParserClass line = new TextParserClass("comma",indivWords);
		return line;
	}
public static TextParserClass spaceLinesParser(String word) throws Exception{
		
	String[] indivWords = word.split(" ");
	TextParserClass line = new TextParserClass("space",indivWords);
	return line;
		
	}
public static TextParserClass pipeLinesParser(String word) throws Exception{
	
	String[] indivWords = word.split("\\|");
	TextParserClass line = new TextParserClass("pipe",indivWords);
	return line;
	
}
	
	
	
}
		
