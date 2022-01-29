/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа. 
 */

package by.koroza.basics_of_software_code_development.linearprograms;

public class NumberFour {

	public static void main(String[] args) {
		double r = 125.123;
		
		int x = (int) r;
		System.out.println(x);
		
		double y = (double) x / 1000;
		System.out.println(y);      
		
		String str = Double.toString(r);
		String[] array = str.split("");
		
		int[] array1 = new int[3];
		array1[0] = Integer.parseInt(array[4]) * 100;
		array1[1] = Integer.parseInt(array[5]) * 10;
		array1[2] = Integer.parseInt(array[6]);
		
		int number = array1[0] + array1[1] + array1[2];
		double rNew = number + y;
		
		System.out.println(rNew);	
	}
}
