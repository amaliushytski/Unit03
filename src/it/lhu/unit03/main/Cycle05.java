package it.lhu.unit03.main;

public class Cycle05 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		while (i <= 99) {
			sum = sum + i;
			i = i + 2;

			System.out.println(sum);
		}
	}
}
