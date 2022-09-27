package it.lhu.unit03.main;

public class Branching11 {

	public static void main(String[] args) {
		double a1 = 5;
		double h1 = 2;
		double a2 = 3;
		double h2 = 6;

		double s1 = 0.5 * a1 * h1;
		double s2 = 0.5 * a2 * h2;
		
		if (s1 > s2) {
			System.out.println("Площадь первого треугольника больше площади второго");
		} else if (s1 < s2) {
			System.out.println("Площадь второго треугольника больше первого второго");
		} else {
			System.out.println("Площади равны");
		}
	}

}
