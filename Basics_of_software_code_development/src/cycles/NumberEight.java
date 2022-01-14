// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 

package cycles;

import java.util.Arrays;

public class NumberEight {

	public static void main(String[] args) {
		int numberOne = 541315612;
		int numberTwo = 985616163;
		String[] arrayOne = pars(numberOne);
		String[] arrayTwo = pars(numberTwo);
		System.out.println(Arrays.toString(arrayOne));
		System.out.println(Arrays.toString(arrayTwo));

		for (int i = 0; i < arrayOne.length; i++) {
			if (i < arrayOne.length - 1) {
				System.out.print(arrayOne[i] + ", ");
			} else if (i == arrayOne.length - 1) {
				System.out.println(arrayOne[i] + ". ");
			}
		}

		for (int i = 0; i < arrayTwo.length; i++) {
			if (i < arrayTwo.length - 1) {
				System.out.print(arrayTwo[i] + ", ");
			} else if (i == arrayTwo.length - 1) {
				System.out.println(arrayTwo[i] + ". ");
			}
		}
	}

	private static String[] pars(int number) {
		String line = Integer.toString(number);
		String[] arrayLine = line.split("");
		return arrayLine;
	}
}