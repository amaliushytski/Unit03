package it.lhu.unit03.main;

public class Branching12 {

	public static void main(String[] args) {
		double a = 2;
		double b = 6;
		double c = -3.7;

		if (a > 0) {
			System.out.println(Math.pow(a, 2));
		} else if (a < 0) {
			System.out.println(Math.pow(a, 4));
		}
		
		if (b > 0) {
			System.out.println(Math.pow(b, 2));
		} else if (b < 0) {
			System.out.println(Math.pow(b, 4));
		}
		
		if (c > 0) {
			System.out.println(Math.pow(c, 2));
		} else if (c < 0) {
			System.out.println(Math.pow(c, 4));
		}
	}

}
