package com.edu.training.jc.repeatAlgoritm;

/**
 * Составить программу вычисления таблицы значений заданной функции для N
 * значений X, меняющихся от Xнач c заданных шагом HX, и M зачений для Z,
 * меняющихся от Zнач с шагом HZ.
 */

public class Task07 {

	public static void main(String[] args) {

		double startZ;
		double stepZ;
		int quatityStepsZ;
		double startX;
		double stepX;
		int quatityStepsX;

		startX = 111;
		stepX = 0.3;
		startZ = 1.1;
		stepZ = 35.1;
		quatityStepsX = 3;
		quatityStepsZ = 5;

		for (int i = 1; i <= quatityStepsX; i++) {
			double copyStartZ = startZ;
			System.out.printf("%.2f ", startX);
			for (int j = 1; j <= quatityStepsZ; j++) {
				if((startX*startX+3.2) < (copyStartZ*copyStartZ)) {
					System.out.printf("\t%.2f \t", copyStartZ);
					System.out.println("Не можем посчитать, у нас лапки");
				continue;
				}
				double f = calculateFunction(startX, copyStartZ);
				System.out.printf("\t%.2f \t", copyStartZ);
				System.out.printf("%.4f \n", f);

				copyStartZ += stepZ;
			}
			startX += stepX;
		}

	}

	
	static double calculateFunction(double x, double z) {
		
		double f = Math.sqrt(x * x + z * z) * Math.log(z) + Math.abs(Math.log(z)) / Math.sqrt(x * x - z * z + 3.2);
		return f;
	}

}
