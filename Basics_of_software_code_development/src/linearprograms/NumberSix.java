/* Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) 
 * принадлежит закрашенной области, и false — в противном случае:
 */

package linearprograms;

import java.util.Scanner;

public class NumberSix {
	private static final int LAST_COORDINATE_POINT_BOTTON_X = 4;
	private static final int FIRST_COORDINATE_POINT_BOTTON_X = -4;
	private static final int LAST_COORDINATE_POINT_TOP_X = 2;
	private static final int FIRST_COORDINATE_POINT_TOP_X = -2;
	private static final int BOTTON_COORDINATE_POINT_Y = -3;
	private static final int TOP_COORDINATE_POINT_Y = 4;
	private static final int ZERO = 0;
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		boolean flag = true;
		Scanner scanX = new Scanner(System.in);
		System.out.println("Ведите координату X: ");
		String lineX = scanX.nextLine();
		System.out.println("Ведите координату Y: ");
		Scanner scanY = new Scanner(System.in);
		String lineY = scanY.nextLine();
		x = Integer.parseInt(lineX);
		y = Integer.parseInt(lineY);
		if ((x >= FIRST_COORDINATE_POINT_BOTTON_X && x <= LAST_COORDINATE_POINT_BOTTON_X) && (y >= BOTTON_COORDINATE_POINT_Y && y <= ZERO)) {
			flag = true;
		} else if ((x >= FIRST_COORDINATE_POINT_TOP_X && x <= LAST_COORDINATE_POINT_TOP_X) && (y >= ZERO && y <= TOP_COORDINATE_POINT_Y)) {
			flag = true;
		} else {
			flag = false;
		}
		System.out.println(flag);
		scanX.close();
		scanY.close();
	}

}
