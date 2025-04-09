package com.edu.training.jc.repeatAlgoritm;

/**
 * Составить программу вычисления значений функции f(x) из задачи 1 для n
 * значений аргумента x, равномерно распределенных на отрезке [a, b]. Для
 * проверки программы задать n = 10; a = 0.50; b = 1.00. Результаты выдать в
 * виде таблицы, в каждой строке порядковый номер, значение аргумента и значение
 * функции с шестью знаками после запятой.
 */

public class Task02 {

	public static void main(String[] args) {

		double startPoint;
		double endPoint;
		int quantitySteps;

		startPoint = 0.5;
		endPoint = 1.0;
		quantitySteps = 10;

		if (startPoint == endPoint) {
			calc(startPoint);
		} else {
			calc(startPoint, endPoint, quantitySteps);
		}
	}

	static void calc(double start, double end, int quantitySteps) {
		double step;
		double argument;
		argument = start;

		step = calculateStepSize(start, end, quantitySteps);

		for (int i = 1; i <= quantitySteps; i++) {
			double result = calculateFunction(argument);
			System.out.print(i + ") \t");
			System.out.printf("%.2f \t", argument);
			System.out.printf("%.6f \t", result);
			System.out.println();
			argument += step;

		}

	}

	static void calc(double argument) {
		double result = calculateFunction(argument);
		System.out.print("1) \t");
		System.out.printf("%.2f \t", argument);
		System.out.printf("%.6f \t", result);
		System.out.println();

	}

	static Double calculateStepSize(double start, double end, int quantity) {

		double step = (end - start) / (quantity - 1);
		return step;
	}

	static Double calculateFunction(double x) {

		double result = Math.sqrt(Math.pow(Math.E, (2.2 * x))) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0)))
				+ 1.7;
		return result;
	}

}
