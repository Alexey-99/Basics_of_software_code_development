 /*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
  * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc. 
  */

package linearprograms;

import java.time.LocalTime;

public class NumberFive {

	public static void main(String[] args) {
		int t = 123125;   
		
		int hours = t / 3600;
		t = t - (hours * 3600);
		
		int minutes = t / 60;
		t = t - (minutes * 60);
		
		int seconds = t;
		
		StringBuilder build = new StringBuilder();
		build.append(hours).append("ч ").append(minutes).append("мин ").append(seconds).append("сек"); 
		System.out.println(build);
		
		LocalTime noon = LocalTime.ofSecondOfDay(12305);
		System.out.println(noon);

	}

}
