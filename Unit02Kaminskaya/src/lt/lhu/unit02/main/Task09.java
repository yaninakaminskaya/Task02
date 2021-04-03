package lt.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {

		int x;
		double fx = 0;

		x = 4;
		
		if(x <= -3) {
			fx = 9;
		} 
		if(x > 3) {
			fx = 1 / (Math.pow(x, 2) + 1);
		}
		if(x > -3 && x <= 3) {
			System.out.println("Бредятина.");
			return;
		} 
		System.out.println("F(x) = " + fx);
	}

}
