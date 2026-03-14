package day_2;

public class Program_5 {
	public static void main(String[] args) {
		int num=23432,count=0;
		int x=2;
		
		while (num!=0) {
			int rem=num%10;
			if (rem==x) {
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}
}
