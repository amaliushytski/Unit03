package it.lhu.unit03.main;

import java.util.Scanner;

public class Cycle06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое, положительное число");
		System.out.print("> ");
		int a = sc.nextInt();
		int b = 1;
		int sum = 0;

		for (int i = b; i <= a; i++) {
			sum = sum + i;
			System.out.println(sum);

		}
	}
}