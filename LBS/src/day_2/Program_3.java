package day_2;

public class Program_3 {
	
	public static int  sumOfDigit(int num) {
		if (num==0) {
			return 0;
		}
		int rem=num%10;
		return rem+sumOfDigit(num/10);
	}
	
	public static void main(String[] args) {
		System.out.println("Sum is : "+ sumOfDigit(123));
	}
}
