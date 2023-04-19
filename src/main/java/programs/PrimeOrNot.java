package programs;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 37;
		int c = 44;
		primeNumberCheck(a);
		primeNumberCheck(b);
		primeNumberCheck(c);
	}
	
	public static void primeNumberCheck(int numToCheck) {
		if(!(numToCheck %2 ==0))	//if number is not divisible by 2
			if(!(numToCheck%3==0))	// or 3
				if(!(numToCheck%5==0))	//or 5
					if(!(numToCheck%7==0))	//or 7
						System.out.println("The number entered ("+numToCheck+") is a prime number");	// print out the prime number
						else {System.out.println("The number entered ("+numToCheck+") is NOT a prime number");} 
				else {System.out.println("The number entered ("+numToCheck+") is NOT a prime number");} 
			else {System.out.println("The number entered ("+numToCheck+") is NOT a prime number");} 
		else {System.out.println("The number entered ("+numToCheck+") is NOT a prime number");} 
	}							

}
