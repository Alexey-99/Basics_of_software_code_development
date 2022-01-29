/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.*/ 

package by.koroza.basics_of_software_code_development.branching;

public class NumberFour {

	public static void main(String[] args) {
		double holeHeight = 5;
		double holeWidth = 3;
		double brickHeight = 4;
		double brickWidth = 2;
		double brickLength = 7;

		if (((holeHeight > brickHeight) && (holeWidth > brickWidth))
				|| ((holeHeight > brickHeight) && (holeWidth > brickLength))
				|| ((holeHeight > brickLength) && (holeWidth > brickWidth))) {
			System.out.println("Кирпич пройдёт в отверстие");
		} else {
			System.out.println("Кирпич не пройдёт в отверстие ни каким образом");
		}
	}
}