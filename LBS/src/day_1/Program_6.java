package day_1;

public class Program_6 {
	public static void main(String[] args) {
		int num=123,sum=0;
		while (num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of Digits are : "+ sum);
	}
}
