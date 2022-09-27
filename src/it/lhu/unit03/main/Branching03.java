package it.lhu.unit03.main;

import java.util.Scanner;

public class Branching03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 3;

		if (a < b) {
			System.out.println("yes");
		} else if (a > b) {
			System.out.println("no");
		}
	}
}
