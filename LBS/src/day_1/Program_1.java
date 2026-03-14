package day_1;

import java.util.Iterator;

public class Program_1 {
	public static void main(String[] args) {
		int num=7;
		boolean isPrime=true;
		for (int i = 2; i < num; i++) {
			if (num%2==0) {
				isPrime=false;
				break;
				
			}
		}
		if (isPrime) {
			System.out.println("Prime No");
		}else {
			System.out.println("Not Prime");
		}
	}
}
