package com.edu.training.jc.repeatAlgoritm;

/**
 * Составить программу, вычисляющую значения функции до тех пор, пока не будет
 * пройден нуль функции. Значения аргумента x должны составлять возрастающую
 * арифметическую програссию с заданным начальным членом 0.1 и разностью 0.1.
 * Для того, чтобы не произошло зацикливания, установить предел изменения
 * аргумента x = 10.
 */

public class Task08 {

	public static void main(String[] args) {

		double startX;
		double stepX;

		startX = 0.1;
		stepX = 0.1;

		double testResult = calculateFunction(startX);
		if (testResult > 0) { // если функция идёт из плюса в минус
			for (double i = startX; i <= 10; i = i + stepX) {
				double result = calculateFunction(i);
				System.out.printf("%.1f \t", i);
				System.out.printf("%.4f \n", result);
				if (result < 0) { // если первое значение после перехода через ноль считать не нужно, то здесь
									// нужжно заново посчитать функцию с увеличенным аргументом и сравнивать с ним
					break;
				}
			}
		} else if (testResult < 0) { // если функция мдёт из минуса в плюс
			for (double i = startX; i <= 10; i = i + stepX) {
				double result = calculateFunction(i);
				System.out.printf("%.1f \t", i);
				System.out.printf("%.4f \n", result);
				if (result > 0) {
					break;
				}
			}
		} else if (testResult == 0) {
			System.out.println("Первое значение функции равно 0 и следующее это уже переход через ноль");
		}
	}

	static double calculateFunction(double x) {
		double y = x * x - Math.pow(Math.E, 2 * x) + 4;
		return y;
	}

}
