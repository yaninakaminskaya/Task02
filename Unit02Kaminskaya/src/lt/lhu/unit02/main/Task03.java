package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		
		Scanner sc;
		int a;
		int b;
		int c;
		
		double x;
		
		sc = new Scanner(System.in);
		
		System.out.print("¬ведите значение числа \"a\" > ");
		a = sc.nextInt();

		System.out.print("¬ведите значение числа \"b\" > ");
		b = sc.nextInt();	
		
		System.out.print("¬ведите значение числа \"c\" > ");
		c = sc.nextInt();
		
		x = a * a - (b - c) * (b - c) + Math.log(b * b + 1);
		
		System.out.println("«начение выражени€ = " + x);
	}
 
}
