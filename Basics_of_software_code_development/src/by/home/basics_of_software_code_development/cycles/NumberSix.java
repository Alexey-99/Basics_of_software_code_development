// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера. 

package by.home.basics_of_software_code_development.cycles;

public class NumberSix {

	public static void main(String[] args) {

		for (int i = 32; i <= 126; i++) {
			System.out.println(i + " " + (char) i);
		}
		System.out.println();
	}
}
