/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. 
 * m и n вводятся с клавиатуры. 
 */

package cycles;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSeven {

	public static void main(String[] args) {
		int m = 0;
		int n = 0;

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Введите минимальное число: ");
		m = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Введите максимальное число: ");
		n = scan2.nextInt();
		int[] array = new int[n - m + 1];
		int indexArray = 0;
		
		for (int i = m; i < n + 1; i++) {
			array[indexArray] = i;
			indexArray++;
		}
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			System.out.print("Натуральное число " + array[i] + " делится без остатка на следующие числа: ");
			for (int j = 2; j < array[i]; j++) {
				if ((array[i] % j == 0) && (j != array[i])) {
					System.out.print(j + " ");
				}
			}
			System.out.println("");
		}

		scan1.close();
		scan2.close();
	}

}
