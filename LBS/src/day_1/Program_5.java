package day_1;

public class Program_5 {
	public static void main(String[] args) {
		int num=10;
		int a=0,b=1;
		int c;
		for (int i = 0; i < num; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(a +  " ");
		}
	}
}
