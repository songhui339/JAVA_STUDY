package com.kh.chapter3.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class B_JavaTime {
	public void method1() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime when = LocalDateTime.of(2022, 5, 25, 22, 42, 59);
		
		System.out.println(now);
		System.out.println(when);
		System.out.println(ZonedDateTime.now()); // 2022-04-19T10:07:31.641129+09:00[Asia/Seoul]
		System.out.println();
		
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		System.out.println();
		
//		LocalDateTime plusDays = now.plusDays(1);
		LocalDateTime plusDays = now.plusDays(1).plusMonths(1).plusYears(1);
		LocalDateTime minusMonths = now.minusMonths(2);
		
		System.out.println(now);
		System.out.println(plusDays);
		System.out.println(minusMonths);
		System.out.println();
		
		System.out.println(now.isAfter(plusDays));
		System.out.println(now.isBefore(plusDays));
		System.out.println(now.isAfter(minusMonths));
		System.out.println(now.isBefore(minusMonths));
		System.out.println();
		
		
//		LocalDate localDate = LocalDate.now();
//		LocalDate localDate = LocalDate.of(2022, 5, 25);
		// now의 객체에서 날짜 정보만 LocalDate로 리턴 
		LocalDate localDate = now.toLocalDate();
		
//		LocalTime localTime = LocalTime.now();
//		LocalTime localTime = LocalTime.of(9, 27, 34);
		// now의 객체에서 시간 정보만 LocalTime으로 리턴 
		LocalTime localTime = now.toLocalTime();
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println();
		
		
		// 문자열을 localDate 객체로 파싱 
//		localDate = LocalDate.parse("2022-09-09");
//		localDate = LocalDate.parse("20220909"); // 포맷이 잘못돼서 에러남 
//		localDate = LocalDate.parse("20220909", DateTimeFormatter.ofPattern("yyyyMMdd"));
		localDate = LocalDate.parse("20220909", DateTimeFormatter.BASIC_ISO_DATE);
		
		System.out.println(localDate);
		System.out.println();
		
		// LocalDateTime 객체를 문자열로 변환(포맷팅) 
		// simpleDateFormat 이랑 비슷한 기능 
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(now);
		System.out.println(now.format(formatter));
		
		formatter = DateTimeFormatter.ISO_ORDINAL_DATE;
		System.out.println(now.format(formatter));
		System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));
//		System.out.println(now.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)); // 에러 남 
//		System.out.println(now.format(DateTimeFormatter.ISO_OFFSET_TIME)); // 에러 남 
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_TIME));
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
