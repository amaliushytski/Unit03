package it.lhu.unit03.main;

import java.util.Scanner;

public class Branching05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число - а");
		System.out.print("> ");
		int a = sc.nextInt();

		System.out.println("Введите число - б");
		System.out.print("> ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("а больше б");
		} else {
			System.out.println("б больше а");
		}

	}

}
