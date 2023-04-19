package programs;

import java.util.*;
public class DuplicatesInArrayOfStrings {

	public static void main(String[] args) {
		String[] data1 = new String[] {"BBC","Abortion", "Morning","After"};
		String[] data2 = new String[] {"After","Money", "Morning","After"};
		String[] data3 = new String[] {"Chicken","Chicken", "Morning","Morning"};
		
		printDuplicatesInStringArray(data1);
		printDuplicatesInStringArray(data2);
		printDuplicatesInStringArray(data3);
	}
	
	public static void printDuplicatesInStringArray(String[] arr) {
		int counter =0;	//variable to count number of duplicates found
		List<String> lst = new ArrayList<String>();	//create list
			for(String a: arr) {	//iterate through string array
				if(lst.contains(a)) {	//if list contains array string then
					System.out.println(a+" is a duplicate in the array");	//print out the string duplicate
					counter++;	
				}else {lst.add(a);}	//if list does NOT contain array string, then add string to the list
			}
		if(counter==0) {	//if counter did not increment with print duplicates
			System.out.println("No duplicates were found");
			System.out.println();
		}else { System.out.println("They were "+counter+" count(s) of duplicates"); System.out.println();}	//print out number of counters that represent duplicates
	}

}
