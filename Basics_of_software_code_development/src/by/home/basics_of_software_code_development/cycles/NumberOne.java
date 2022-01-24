/*Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа. 
 */

package by.home.basics_of_software_code_development.cycles;

import java.util.Scanner;

public class NumberOne {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число: ");
		int number = scan.nextInt();
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println("Сумма числел от 1 до " + number + " равна " + sum);
		scan.close();
	}
}