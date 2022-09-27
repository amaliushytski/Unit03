package it.lhu.unit03.main;

public class Cycle10 {

	public static void main(String[] args) {
		long mult = 0;

		for (long i = 1; i <= 200; i++) {
			mult = (mult + i * i) * i;
		}
		System.out.println(mult);
	}

}
