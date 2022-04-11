package se.lexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExamples {

  public static void main(String[] args) {
    //localDateExample();
    //localTimeExample();
    //dateTimeExample();
    //localDateTimeFormatter();
    //periodExample();
    durationExample();
  }


  public static void localDateExample(){
    LocalDate today = LocalDate.now();
    System.out.println(today);
    LocalDate nextBirthDay = LocalDate.parse("2023-02-27");
    System.out.println(nextBirthDay);
    LocalDate nextBirthDayNew = LocalDate.of(2023,2,27);
    System.out.println(nextBirthDayNew);

    LocalDate myBirthDate  = nextBirthDay.minusYears(34);
    System.out.println(myBirthDate);


    System.out.println(today.getDayOfMonth());
    System.out.println(today.getDayOfWeek());
    System.out.println(today.getMonth());
    System.out.println(today.getYear());


  }


  public static void localTimeExample(){
    LocalTime currentTime = LocalTime.now();
    System.out.println(currentTime);

    System.out.println(currentTime.truncatedTo(ChronoUnit.MINUTES));
    System.out.println(currentTime.truncatedTo(ChronoUnit.SECONDS));

    LocalTime localTime = LocalTime.parse("09:00");
    System.out.println(localTime);

    LocalTime localTime1 = localTime.plusHours(2);
    System.out.println(localTime1);
  }


  public static void dateTimeExample(){
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println(currentDateTime);

    //LocalDateTime test = LocalDateTime.parse("2022-01-01T10:10");
    LocalDateTime test = LocalDateTime.of(2022,1,1,10,10);
    System.out.println(test);

  }

  public static void localDateTimeFormatter(){
    LocalDate localDate =  LocalDate.now();
    String basicISOFormat = localDate.format(DateTimeFormatter.ISO_DATE);
    System.out.println(basicISOFormat);

  }

  public static void periodExample(){
    LocalDate myBirthDate = LocalDate.parse("1989-02-27");
    LocalDate currentDate = LocalDate.now();

    Period period = Period.between(myBirthDate,currentDate);
    System.out.println(period.getDays());
    System.out.println(period.getMonths());
    System.out.println(period.getYears());

  }


  public static void durationExample(){
    LocalTime startTime = LocalTime.parse("08:00");
    LocalTime endTime = LocalTime.parse("17:00");

    System.out.println(Duration.between(startTime,endTime));

  }

  // compare date using isAfter, isBefore and isEqual or compareTo


}
