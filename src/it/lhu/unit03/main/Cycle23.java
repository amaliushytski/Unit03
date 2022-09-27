package it.lhu.unit03.main;

public class Cycle23 {

	public static void main(String[] args) {
		double a = 0.1;
		double b = 12.4;
		double h = 0.5;
		double y;

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x = x + h) {
			y = 1 / Math.tan(x / 3) + Math.sin(x) * 0.5;
			System.out.printf("|\t%4.2f\t|\t%4.2f\t|\n", x, y);
		}

	}

}
