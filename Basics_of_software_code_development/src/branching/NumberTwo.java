//Найти max{min(a, b), min(c, d)}. 

package branching;

public class NumberTwo {

	public static void main(String[] args) {
		StringBuilder build = new StringBuilder();
		double a = 2;
		double b = 10;
		double c = 5;
		double d = 2;
		double minAAndB = 0;
		double minCAndD = 0;
		double max = 0;

		minAAndB = min(a, b);
		minCAndD = min(c, d);
		max = max(minAAndB, minCAndD);
		build.append("Минимальное значение между переменными ").append(a).append(" и ").append(b).append(" равное ");
		build.append(minAAndB).append(".").append("\n");
		build.append("Минимальное значение между переменными ").append(c).append(" и ").append(d).append(" равное ");
		build.append(minCAndD).append(".").append("\n");
		build.append("Максимальное значение между");
		build.append(" минимальным значением переменных (a = ").append(a).append(" и b = ").append(b).append(")");
		build.append(" и минимальным значением переменных (с = ").append(c).append(" и d = ").append(d).append(")");
		build.append("\n").append(" равняесться ").append(max).append(".");
		System.out.println(build);
	}

	private static double min(double numberOne, double numberTwo) {
		double min = numberOne;
		double[] arrayNumbers = { numberOne, numberTwo };
		for (Double element : arrayNumbers) {
			if (element < min) {
				min = element;
			}
		}
		return min;
	}

	private static double max(double numberOne, double numberTwo) {
		double max = numberOne;
		double[] arrayNumbers = { numberOne, numberTwo };
		for (Double element : arrayNumbers) {
			if (element > max) {
				max = element;
			}
		}
		return max;
	}
}