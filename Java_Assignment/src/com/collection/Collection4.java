package com.collection;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Collection4 {

	public static void main(String[] args) {
		
		List<LocalDate> ll=new LinkedList<>();
		ll.add(LocalDate.of(1999,Month.MARCH,14));
		ll.add(LocalDate.of(2004,Month.MAY,12));
		ll.add(LocalDate.of(1998,Month.MAY,17));
		ll.add(LocalDate.of(1976,Month.FEBRUARY,04));
		ll.add(LocalDate.of(1970,Month.OCTOBER,27));
		ll.add(LocalDate.of(2020,Month.DECEMBER,21));
		ll.add(LocalDate.of(2006,Month.OCTOBER,30));
		ll.add(LocalDate.of(2008,Month.MARCH,31));
		ll.add(LocalDate.of(2009,Month.SEPTEMBER,20));
		ll.add(LocalDate.of(2004,Month.NOVEMBER,8));
		
		for(LocalDate ld: ll)
		{
			if(ld.isLeapYear())
			{
				System.out.println("Your date of birth is "+ld+" and it was leap year");
			}
			else
			{
				System.out.println("Your date of birth is "+ld+" and it was not leap year");
			}
		}
	}

}