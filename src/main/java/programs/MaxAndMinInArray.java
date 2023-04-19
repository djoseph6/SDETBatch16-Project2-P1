package programs;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		int[] data1 = new int[] {10,20,30,40,50,60,70};
		int[] data2 = new int[] {2,5,8,97,-3,44,21};
		int[] data3 = new int[] {-4,-56,-23,-100,-88};
		
		arrayMaxAndMin(data1);
		arrayMaxAndMin(data2);
		arrayMaxAndMin(data3);
	}
	
	public static void arrayMaxAndMin(int[] arr) {
		int intMax =Integer.MIN_VALUE;	//variable with lowest possible value of int. Used to compare with array numbers.
		for(int max:arr) {	//iterate through array
			if(max>=intMax) {	//if array number is bigger than or equal lowest possible value
				intMax = max;	//assign that number to that variable
			}else {continue;}	//if the array number is smaller, move to next iteration in enchanced for loop
		}
		int intMin=Integer.MAX_VALUE;	//same with max but using highest possible value
			for(int min: arr) {
				if(min<intMin) {	//if array number is smaller than or equal to higest possible number
					intMin = min;	//assign that number to that variable
				}else {continue;}	//if the array number is bigger, move to next iteration in enchanced loop
			}
		System.out.println("The Maximum number in the given array is: "+intMax);
		System.out.println("The Minimum number in the given array is: "+intMin);
	}

}
