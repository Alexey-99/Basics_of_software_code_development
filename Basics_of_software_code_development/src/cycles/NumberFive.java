/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид: 
 */

package cycles;

import java.util.Arrays;
import java.util.Random;

public class NumberFive {

	public static void main(String[] args) {
		double e = 2;
		double commonTerm = 0;
		double sumCommonTerm = 0;
		Random rand = new Random();
		double[] array = new double[50];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextDouble() * 5;
		}

		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i]) >= e) {
				double n = Math.abs(array[i]);
				commonTerm = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
				commonTerm = factorial(commonTerm);
				sumCommonTerm += commonTerm;
			}
		}
		System.out.println(sumCommonTerm);
	}

	private static double factorial(double commonTerm) {
		int factorial = (int) commonTerm;
		if (factorial == 0) {
			factorial = 1;
		} else if (factorial > 0) {
			for (int i = 1; i <= factorial; i++) {
				factorial *= i;
			}
		}
		return factorial;
	}

}
