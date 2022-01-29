// Найдите значение функции: z = ((a – 3 ) * b / 2) + c. 

package by.koroza.basics_of_software_code_development.linearprograms;

public class NumberOne {

	public static void main(String[] args) {
		double result = 0;
		double a = 5;
		double b = 3;
		double c = 2;
		
		result = ((a - 3) * b - 2) + c;
		
		System.out.println("Результат: " + result);
	}
}
