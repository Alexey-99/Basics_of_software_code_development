//Составить программу нахождения произведения квадратов первых двухсот чисел. 

package by.home.basics_of_software_code_development.cycles;

public class NumberFour {

	public static void main(String[] args) {
		int product = 1;

		for (int i = 1; i <= 200; i++) {
			product *= Math.pow(i, 2);
		}
		System.out.println("Произведение квадратов первых двухсот чисел равное " + product);
	}
}
