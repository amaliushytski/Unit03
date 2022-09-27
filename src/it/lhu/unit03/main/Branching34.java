package it.lhu.unit03.main;

import java.util.Scanner;

public class Branching34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите стоимость книг");
		System.out.print("> ");
		double a = sc.nextDouble();

		System.out.println("Введите сумму денег");
		System.out.print("> ");
		double b = sc.nextDouble();

		if (a < b) {
			System.out.println("Возьмите сдачу" + "-" + (b - a) + "р.");
		} else if (a > b) {
			System.out.println("Необходимо доплатить" + "-" + (a - b) + "р.");
		} else {
			System.out.println("Спасибо");
		}
	}

}
