package it.lhu.unit03.main;

public class Branching08 {

	public static void main(String[] args) {
		double a = 5;
		double b = 9;

		double squareValueA = a * a;
		double squareValueB = b * b;

		if (squareValueA > squareValueB) {
			System.out.println("Квадрат b меньше квадрата a");
		} else {
			System.out.println("Квадрат a меньше квадрата b");
		}

	}

}
