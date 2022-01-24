/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦 / 𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) * 𝑡𝑔 𝑥𝑦  
 */

package by.home.basics_of_software_code_development.linearprograms;

public class NumberThree {

	public static void main(String[] args) {
		double x = 2;
		double y = 4;
		double result = 0;
		
		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println("Результат: " + result);

	}

}
