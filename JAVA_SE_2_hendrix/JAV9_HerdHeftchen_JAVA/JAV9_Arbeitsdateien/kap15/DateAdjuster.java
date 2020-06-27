package com.herdt.java9.kap15;
import java.time.*;
import java.time.temporal.*;

class DateAdjuster
{
	public static void main(String[] args)
	{
		LocalDate firstMonday = LocalDate.of(2017, 9, 1). with(
			TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
		System.out.println(firstMonday.toString());
 	}
}