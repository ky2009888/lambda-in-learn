package com.ky2009888.apps.date;

import lombok.extern.slf4j.Slf4j;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * 时间工具类的用法 LocalDate LocalDateTime
 *
 * @author Lenovo
 */
@Slf4j
public class DateUsgRelational {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        log.info("{}", localDate);
        //时间格式化
        localDate.format(DateTimeFormatter.ofPattern("MM-yyyy-dd"));
        log.info("{}", localDate);
        LocalDate localDate1 = LocalDate.of(2020, 9, 9);
        log.info("{}", localDate1.toString());
        log.info("year:{}", localDate1.getYear());
        log.info("------------------------------------localDateTime");
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("{}", localDateTime);
        log.info("hour:{}", localDateTime.getHour());
        LocalDateTime lastYearTime = LocalDateTime.of(2020, 9, 1, 23, 9, 54);
        int hour = lastYearTime.getHour();
        log.info("hour:{}", hour);
        //时间的加plus和减
        LocalDateTime nowYear = lastYearTime.plusYears(1);
        log.info("nowYear：{}", nowYear);
        LocalDateTime minusDays = nowYear.minusDays(2);
        log.info("minusDays：{}", minusDays);
        //时间比较
        boolean valTimeFlag = minusDays.isAfter(localDateTime);
        log.info("valTimeFlag：{}", valTimeFlag);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format = dateTimeFormatter.format(localDate1);
        log.info(format);
        LocalDate date1 = LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);
        log.info("{}", date1);
        LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
        ZoneId romeZone = ZoneId.of("Europe/Rome");
        ZonedDateTime zdt1 = date.atStartOfDay(romeZone);
        log.info("{}", zdt1);
        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
        ZonedDateTime zdt2 = dateTime.atZone(romeZone);
        log.info("{}", zdt2);
        Instant instant = Instant.now();
        ZonedDateTime zdt3 = instant.atZone(romeZone);
        log.info("{}", zdt3);
    }
}
