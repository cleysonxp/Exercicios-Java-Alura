package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		System.out.println(agora.format(formatador));
		
//		LocalDate data = LocalDate.of(2099, 1, 25);
		LocalDate data = LocalDate.of(2099, Month.JANUARY, 25); //enum 
		System.out.println(data.format(formatador));
		
		Period periodo = Period.between(agora, data);
		System.out.println(periodo.getYears());
		
		// Lidando com hora
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDateTime agoraD = LocalDateTime.now();
		System.out.println(agoraD.format(formatadorComHoras));
		
		
	}

}
