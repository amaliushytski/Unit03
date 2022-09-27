package it.lhu.unit03.main;

public class Cycle07 {

	public static void main(String[] args) {
		int a = -5;
		int b = 5;
		int h = 2;
		int y;

		for (int i = a; i <= b; i = i + h) {
			if (i > 2) {
				y = i;
			} else {
				y = i * (-1);
			}
			System.out.println("Если x = " + i + " y равно: " + y);
		}
	}
}
