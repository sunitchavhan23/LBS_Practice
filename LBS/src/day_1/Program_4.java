package day_1;

public class Program_4 {
	public static void main(String[] args) {
		int num=370,sum=0;
		int n=num;
		while (num!=0) {
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if (n==sum) {
			System.out.println("Its Armstrong");
		} else {
			System.out.println("Not a Armstrong");
		}
	}
}
