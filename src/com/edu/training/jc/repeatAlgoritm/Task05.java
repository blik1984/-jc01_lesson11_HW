package com.edu.training.jc.repeatAlgoritm;

/**
 * Составить программу вычисления N значений функции Y для X, изменяющегося от
 * X1 с шагом dX. В качестве начальных значений выбрать A=1; X1=-2A; dX = A/5.
 */

public class Task05 {

	public static void main(String[] args) {

		double x;
		double stepSize;
		double a;
		int quantitySteps;
		
		a = 1;
		quantitySteps = 10;
		
		x = -2 * a;
		stepSize = a / 5;

		for (; quantitySteps > 0; quantitySteps--) {
			double res;
			if (x <= 0) {
				res = a / 2 * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
				x += stepSize;
			} else {
				res = 4 * Math.pow(a, 3) / (x * x + 4 * a * a);

			}
			System.out.println(res);

		}

	}

}
