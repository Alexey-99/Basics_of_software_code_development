/* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
 * и если да, то будет ли он прямоугольным. 
 */

package by.koroza.basics_of_software_code_development.branching;

public class NumberOne {
	private static final String ANGLE_A_WAS_ENTERED_INCORRECTLY = "Не верно введен угол A, так как он равен ";
	private static final String ANGLE_B_WAS_ENTERED_INCORRECTLY = "Не верно введен угол B, так как он равен ";
	private static final String BUT_SHOULD_BE_LESS_THEN_but_ONE_HUNDRED_AND_EIGHTY_DEGREES = ", а должен быть меньше 180 градусов";
	private static final String NOT_EXISTS_TRIANGLE = "Треугольника с данными углами не существует. Так как сумма углов A и B равна ";

	public static void main(String[] args) {
		double A = 30;
		double B = 60;
		boolean correctTriangle = true;

		System.out.println("Угол A равен " + A + ", угол B равен " + B + ".");
		correctTriangle = angleLessThanOneHundredAndEightyDegrees(A, B);
		if (correctTriangle == true) {
			existsThisTriangle(A, B);
			whatKindTriangle(A, B);
		}
	}

	private static boolean angleLessThanOneHundredAndEightyDegrees(double A, double B) {
		boolean flag = true;
		if (A >= 180.0) {
			flag = false;
			System.out.println(
					ANGLE_A_WAS_ENTERED_INCORRECTLY + A + BUT_SHOULD_BE_LESS_THEN_but_ONE_HUNDRED_AND_EIGHTY_DEGREES);
		}
		if (B >= 180.0) {
			flag = false;
			System.out.println(
					ANGLE_B_WAS_ENTERED_INCORRECTLY + B + BUT_SHOULD_BE_LESS_THEN_but_ONE_HUNDRED_AND_EIGHTY_DEGREES);
		}
		return flag;
	}

	private static void existsThisTriangle(double A, double B) {
		double C = 180 - A - B;
		double sum = A + B + C;
		if (sum != 180) {
			System.out.println(NOT_EXISTS_TRIANGLE + sum + BUT_SHOULD_BE_LESS_THEN_but_ONE_HUNDRED_AND_EIGHTY_DEGREES);
		} else {
			System.out.println("Треугольник с данными углами существует.");
		}
	}

	private static void whatKindTriangle(double A, double B) {
		double rightAngle = 90;
		double C = 180 - A - B;
		if (A == rightAngle || B == rightAngle || C == rightAngle) {
			System.out.println("Треугольник с данными углами является прамоугольным.");
		} else {
			System.out.println("Треугольник с данными углами не является прамоугольным.");
		}
	}
}