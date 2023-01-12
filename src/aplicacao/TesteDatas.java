package aplicação;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TesteDatas {

	public static void main(String[] args) {
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		LocalDate d4 = LocalDate.parse("2022-12-16");
		LocalDateTime d5 = LocalDateTime.parse("2022-12-16T11:39:21");
		Instant d6 = Instant.parse("2022-12-16T11:39:21Z");
		Instant d7 = Instant.parse("2022-12-16T11:39:21-03:00");
		LocalDate d8 = LocalDate.parse("16/12/2022", df1);
		LocalDateTime d9 = LocalDateTime.parse("16/12/2022 01:30", df2);
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter df4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter df5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d6, ZoneId.of("Portugal"));
		System.out.println(r2.getMinute());
		LocalDate semanaPassada = d1.minusDays(7);
		LocalDate semanaProxima = d1.plusDays(7);
		LocalDateTime semanaPassadaTime = d5.minusDays(7);
		LocalDateTime semanaProximaTime = d5.plusDays(7);
		Instant semanaPassadaInstant = d6.minus(7, ChronoUnit.DAYS);
		Instant semanaProximaInstant = d6.plus(7, ChronoUnit.DAYS);
		System.out.println(semanaPassadaInstant);
		System.out.println(semanaProximaInstant);
		Duration t1 = Duration.between(semanaPassada.atTime(0, 0), d1.atTime(0, 0));
		System.out.println(t1.toDays());
		Duration t2 = Duration.between(semanaPassada.atStartOfDay(), d1.atStartOfDay());
		System.out.println(t2.toDays());
		Duration t3 = Duration.between(semanaPassadaTime, d5);
		System.out.println(t3.toDays());
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d11);
		System.out.println(d4);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);
		System.out.println(df3);
		System.out.println(df4);
		System.out.println(df5);
		System.out.println(r1);
		System.out.println(semanaProximaTime);
		System.out.println(semanaProxima);
	}

}
