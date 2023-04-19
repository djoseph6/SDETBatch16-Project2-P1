package programs;

public class FirstTenFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printFirst10Fibonacci();

	}
	
	public static void printFirst10Fibonacci() {	//The Fibonacci sequence is the series of numbers where each number is the sum of the two preceding numbers.
		int addend1 = 0;
		int addend2 = 1;
		System.out.println("Fibonacci Number 0 is: " + addend1);
		System.out.println("Fibonacci Number 1 is: " + addend2);
		
		for(int a=2; a<11;a++) {
			int sum = addend1 +addend2;	//sum of precedant numbers
			System.out.println("Fibonacci Number "+a+" is: " + sum);
			addend1 = addend2; //assign last precedant number to the first
			addend2 = sum;	//assign sum as the new last precedant number
		}
	}

}
