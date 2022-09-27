package it.lhu.unit03.main;

public class Cycle11 {

	public static void main(String[] args) {
		double x = 0;

		for (double i = 0; i <= 200; i++) {
			x = x - Math.pow(i, 3);
		}
		System.out.println(x);
	}
}
