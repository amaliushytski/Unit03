package it.lhu.unit03.main;

public class Branching07 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int x = 5;

		int mod = a * x * x + b * x + c;
		
        if (mod < 0){
        	mod = mod * (-1);
        }

        System.out.println("Модуль выражения равен " + mod);
	}

}
