 /* Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
  * (𝑏 + √𝑏2 + 4𝑎𝑐 / 2𝑎) − 𝑎3𝑐 + 𝑏−2 
  */

package linearprograms;

public class NumberTwo {

	public static void main(String[] args) {
		double result = 0;
		double a = 3;
		double b = 2;
		double c = 5;
		
		
		result = (b + (Math.sqrt(Math.pow(b, 2) + (4 * a * c)))) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
		System.out.println("Результат: " + result);
	}
}
