package com.ky2009888.apps.date;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Lenovo
 */
@Slf4j
public class DateUsgRelational {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
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
    }
}
