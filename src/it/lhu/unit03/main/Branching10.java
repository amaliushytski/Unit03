package it.lhu.unit03.main;

public class Branching10 {

	public static void main(String[] args) {
		double r1 = 5;
		double r2 = 3;

		double s1 = Math.PI * (r1 * r1);
		double s2 = Math.PI * (r2 * r2);

		if (s1 > s2) {
			System.out.println("Площадь первого круга больше площади второго");
		} else if (s1 < s2) {
			System.out.println("Площадь второго круга больше первого второго");
		} else {
			System.out.println("Площади равны");
		}

	}

}
