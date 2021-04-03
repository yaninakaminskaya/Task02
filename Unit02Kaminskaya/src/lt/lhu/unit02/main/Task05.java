package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double result;
		
		a = 3.0;
		b = 6.0;
		c = 4.0;
		
		double temp;
		temp = b + Math.sqrt(b * b + 4 * a * c);
		
		result = temp /(2 * a) - Math.pow(a,3) * c + b;
		
		System.out.println("temp = " + temp);
		System.out.println("result = " + result);
	}

}
