package programs;


import java.util.Collections;
import java.util.List;
import java.util.*;

public class SecondMaxNumInArray {

	public static void main(String[] args) {
		int[] data1 = new int[] {10,20,30,40,50,60,70};
		int[] data2 = new int[] {2,5,8,97,-3,44,21};
		int[] data3 = new int[] {-4,-56,-23,-100,-88};
		
		secondHighestInArray(data1);
		secondHighestInArray(data2);
		secondHighestInArray(data3);

	}
	
	public static void secondHighestInArray(int[] arr) {
		List<Integer> lst = new ArrayList<Integer>();	//create an list that can use Collections.sort
			for(int a:arr) {	//iterate through the array
				lst.add(a);	//add each number in array to list
			}
		Collections.sort(lst);	//sort the list from smallest to largest
		int secondToLastIndex = lst.size()-2;	//assign variable the second to last index which contains second largest number
		System.out.println("The second largest number in this array is: "+lst.get(secondToLastIndex));	//retrieve the second to last index in the list
	}

}
