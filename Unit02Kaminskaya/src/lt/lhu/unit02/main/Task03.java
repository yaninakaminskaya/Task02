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
		
		System.out.print("������� �������� ����� \"a\" > ");
		a = sc.nextInt();

		System.out.print("������� �������� ����� \"b\" > ");
		b = sc.nextInt();	
		
		System.out.print("������� �������� ����� \"c\" > ");
		c = sc.nextInt();
		
		x = a * a - (b - c) * (b - c) + Math.log(b * b + 1);
		
		System.out.println("�������� ��������� = " + x);
	}
 
}
