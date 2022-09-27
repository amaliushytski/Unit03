package it.lhu.unit03.main;

public class Branching40 {

	public static void main(String[] args) {
		double x = 14;
		double fx = 0;

		if (x <= 13) {
			fx = -Math.pow(x, 3) + 9;
			System.out.println(fx);
		} else if (x > 13) {
			fx = -3 / (x + 1);
			System.out.println(fx);
		}

	}

}
