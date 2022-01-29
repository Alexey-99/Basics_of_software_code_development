/*	Вычислить значение функции:
 *              
 *  F(x) = {x2 - 3x + 9, если x <= 3
 *         {1 / (x2 + 6), если x > 3  
 */        

package by.koroza.basics_of_software_code_development.branching;

public class NumberFive {

	public static void main(String[] args) {
		double x = 10;
		double y = 0;

		if (x <= 3) {
			y = Math.pow(x, 2) - (3 * x) + 9;
		} else if (x > 3) {
			y = 1 / (Math.pow(x, 2) + 6);
		}
		System.out.println("F(x) равен " + y);
	}
}