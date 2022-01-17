/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.*/  

package branching;

public class NumberThree {

	public static void main(String[] args) {
		int xOne = 1;
		int yOne = 1;
		int xTwo = 2;
		int yTwo = 2;
		int xThree = 3;
		int yThree = 3;
		double resulLeft = 0;
		double resulRight = 0;

		resulLeft = (xThree - xOne) / (xTwo - xOne);
		resulRight = (yThree - yOne) / (yTwo - yOne);

		if (resulLeft == resulRight) {
			System.out.println("Все три точки принадлежат одной прямой");
		} else {
			System.out.println("Не все три точки принадлежат одной прямой");
		}
	}

}
