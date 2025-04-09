package com.edu.training.jc.repeatAlgoritm;

/**
 * Целочисленная функция f(K) = K 3 - 25K 2 +50K+1000 определена только для
 * целых значений аргумента K. Составить программу вычисления значений функции
 * f(K) для 20 значений алгумента K в интервале (-30, 60) с выводом лишь тех
 * значений, которые удовлетворяют заданному условию, и подсчетом количества
 * остальных ее значений. В качестве начальных значений укажите A=3*103 ,
 * B=6*104* , M=4. Условие для определения выводимых значений f(K)
 */

public class Task06 {
	
	
	static double t1;	//объявлены здесь исключительно чтобы проще было вывести на консоль
	static double t2;
	static double t3;
	static double t4;

	public static void main(String[] args) {

		int a;
		int b;
		int m;
		int startK;
		int endK;
		int counter = 0;

		a = 3000;
		b = 60000;
		m = 4;
		startK = -30;
		endK = 60;

		for (int i = startK; i <= endK; i++) {
			int f = calculateFunction(i);
			if (checkInterval(a, b, m, f)) {
				System.out.println(f);
			} else {
				counter++;
			}
		}
		System.out.println("Не прошло по условиям " + counter + " значений функции");
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		System.out.println("t4 = " + t4);

	}

	static int calculateFunction(int x) {
		int f = x * x * x - 25 * x * x + 50 * x + 1000;
		return f;
	}

	static boolean checkInterval(int a, int b, int m, int f) {
			
//			double t1;
//			double t2;
//			double t3;
//			double t4;
			
			t1 = Math.sqrt(a+b+m);
			t2 = m * Math.sqrt(a+b);
			t3 = Math.sqrt(a*b*m);
			t4 = m * Math.sqrt(a*b);
			
			if (t1<t2) {
				if(f>=t1 && f<=t2) {
					return true;
				}
			}else {
				if (f>=t2 && f<=t1) {
					return true;
				}
			}
			if (t3<t4) {
				if(f>=t3 && f<=t4) {
					return true;
				}
			}else {
				if(f>=t4 && f<=t3) {
					return true;
				}
			}
			return false;
		}
}
