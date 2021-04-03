package lt.lhu.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double d;
		
		a = 8.0;
		b = 2.0;
		c = 10.0;
		d = 4.0;
		
		double result;
		result = (a / c) * (b / d) - (a * b - c) / (c * d);
		
		System.out.print("result =" + result);
	}

}