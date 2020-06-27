package com.herdt.java9.kap15;
import java.time.*;

class DateTimeZone
{
	public static void main(String[] args)
	{
		LocalDateTime now = LocalDateTime.now();
		ZoneId zone = ZoneId.of("Europe/Berlin");
		ZonedDateTime zdt = now.atZone(zone);
		System.out.println(zdt.toString());

		ZonedDateTime zdt2 = ZonedDateTime.of(1995, 5 ,23, 15, 0, 0, 0, ZoneId.of ("America/New_York"));
		System.out.println(zdt2.toString());
 	}
}