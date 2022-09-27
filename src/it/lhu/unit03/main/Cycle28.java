package it.lhu.unit03.main;

import java.util.Scanner;

public class Cycle28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		char sign;
		int result = 0;

		while (true) {
			System.out.println("Введите первое число");
			System.out.print("> ");
			if (sc.hasNextInt()) {
				x = sc.nextInt();
			} else {
				System.out.println("Вы ввели некоректное число");
				System.out.println("> ");
				sc.next();
				x = sc.nextInt();
			}

			System.out.println("Введите второе число");
			System.out.print("> ");
			if (sc.hasNextInt()) {
				y = sc.nextInt();
			} else {
				System.out.println("Вы ввели некоректное число");
				System.out.println("> ");
				sc.next();
				y = sc.nextInt();
			}

			System.out.println("Введите знак операции (+, –, /, *)");
			System.out.print("> ");
			if (sc.hasNext()) {
				sign = sc.next().charAt(0);
			} else {
				System.out.println("Вы ввели некоректный знак операции");
				System.out.println("> ");
				sc.next();
				sign = sc.next().charAt(0);
			}

			switch (sign) {
			case '-':
				result = x - y;
				break;
			case '+':
				result = x + y;
				break;
			case '*':
				result = x * y;
				break;
			case '/':
				if (y == 0 && sign == '/') {
					System.out.println("Деление на ноль невозможно");
					System.exit(0);

				} else {
					result = x / y;
				}
				break;
			default:
				System.out.println("Что-то пошло не так");
				return;
			}
			System.out.println("Результат вычисления равен: " + result);
			System.out.println("-------------------------------------");
		}
	}
}
