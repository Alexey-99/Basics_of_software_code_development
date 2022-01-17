/* Вычислить значения функции на отрезке [а,b] c шагом h: 
y = {x,x > 2
	{-x,x <= 2	
*/

package cycles;

public class NumberTwo {

	public static void main(String[] args) {
		int a = -10;
		int b = 10;
		int h = 2;
		int x = 0;
		int y = 0;

		for (int i = a; i < b; i += h) {
			x = i;
			if (x > 2) {
				y = x;
			} else if (x <= 2) {
				y = -x;
			}
			System.out.println(y);
		}

	}

}
