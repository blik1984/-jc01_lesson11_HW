package com.edu.training.jc.repeatAlgoritm;

import java.util.Random;

/**
 * Задается n точек на плоскости. Записать логическое выражение, соответствующее
 * заданной области истинности. Подсчитать количество точек, попавших в заданную
 * область.
 */

public class Task04 {

	public static void main(String[] args) {

		double x;
		double y;
		int n = 30;
		int counter = 0;
		Random rand = new Random();
		for (int i = 1; i <= n; i++) {
			x = (double) (rand.nextInt(50)) / 10;
			y = (double) (rand.nextInt(50)) / 10;
			if (rand.nextBoolean()) {
				x = x * -1;
			}
			if (rand.nextBoolean()) {
				y = y * -1;
			}

			if (y >= 0 && y <= 2 && x <= 0 && x >= -2 || y >= -1 && y <= 1 && x >= 0 && x <= 2) {
				counter++;
				System.out.printf("%.1f; %.1f, Попал", x, y);
				System.out.println();
			} else {
				System.out.printf("%.1f; %.1f, Мимо", x, y);
				System.out.println();
			}
		}
		System.out.println("Количество попаданий составило - " + counter);

	}

}
