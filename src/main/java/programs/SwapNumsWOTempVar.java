package programs;

public class SwapNumsWOTempVar {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		swapNums(a,b);
		swapNums(21, 16);
		swapNums(-3,12);
		
		
	}
	
	public static void swapNums(int num1, int num2) {	//Ex. 5,10
		System.out.println("Number 1 is : "+num1+ ", and Number 2 is: " + num2); // prints 5 and 10
		num1 += num2;  // num1 = 5+10 or 15
		num2 = num1-num2;	//num2 = 15-10 or 5
		num1 -= num2;	//num1 = 15-5 or 10
		System.out.println("Number 1 is now : "+num1+ ", and Number 2 is now: " + num2);
		
	}

}
