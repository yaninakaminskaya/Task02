package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc;
		int x;
		int y;

		int sum;

		sc = new Scanner(System.in);
		for (;;) {
			System.out.print("¬ведите значение числа \"x\" > ");
			x = sc.nextInt();

			System.out.print("¬ведите значение числа \"b\" > ");
			y = sc.nextInt();

			sum = x + y;

			System.out.println("—умма = " + sum);
		}
	}

}
