package com.edu.training.jc.repeatAlgoritm;

/**
 * Составить программу для вычисления результат по формуле. В качестве входных
 * параметров задать x = 0.5; n = 20;
 */

public class Task03 {

	public static void main(String[] args) {

		double x = 0.5;
		int n = 20;

		double result;
		double calcSum = 0;
		for (int i = 1; i <= n; i++) {

			double res = (Math.sin(i * x / 2) + Math.sin((i * x - 1) / 2)) / Math.pow(Math.E, x - (1 / i));
			calcSum += res;
		}
		result = Math.sqrt(Math.PI * n) * calcSum;

		System.out.println(result);
	}
}
