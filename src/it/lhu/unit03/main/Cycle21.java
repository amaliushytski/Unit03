package it.lhu.unit03.main;

public class Cycle21 {

	public static void main(String[] args) {
		double a = -3;
		double b = 5;
		double h = 1;
		double y;

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x = x + h) {
			y = x - Math.sin(x);
		System.out.printf("|\t%4.2f\t|\t%4.2f\t|\n", x, y);
		}
	}

}
