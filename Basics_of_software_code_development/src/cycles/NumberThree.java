// Найти сумму квадратов первых ста чисел. 

package cycles;

public class NumberThree {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println("Cумма квадратов первых ста чисел равно " + sum);
	}
}
