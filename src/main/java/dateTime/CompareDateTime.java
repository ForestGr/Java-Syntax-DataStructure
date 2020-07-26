package dateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class CompareDateTime {
  public static void main(String[] args) throws ParseException {

    /**
     * PART I: compare date
     * https://www.callicoder.com/how-to-compare-date-time-java/
     */
    /*Method 1: compare dates using LocalDate*/
    System.out.println("***compare date using LocalDate***");
    LocalDate date1 = LocalDate.now();
    LocalDate date2 = LocalDate.of(2020, 1, 31);

    /*接下来line29- 52比较方法适用于接下来所有situations & methods, 接下来只initiate objects*/
    // isAfter() method
    if(date1.isAfter(date2)) {
      System.out.println(date1 + " is after " + date2);
    }

    // isBefore() method
    if(date1.isBefore(date2)) {
      System.out.println(date1 + " is before " + date2);
    }

    // isEqual() method
    if(date1.isEqual(date2)) {
      System.out.println(date1 + " is equal to " + date2);
    }

    // compareTo() method
    int diffDate = date1.compareTo(date2);
    if(diffDate > 0) {
      System.out.println(date1 + " is greater than " + date2);
    } else if (diffDate < 0) {
      System.out.println(date1 + " is less than " + date2);
    } else {
      System.out.println(date1 + " is equal to " + date2);
    }

    /*Method 2: compare dates using Date class  + SimpleDateFormat*/
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date simpleDate1 = sdf.parse("2020-01-31 10:30:45"); //.parse need to throws ParseException in the signature
    Date simpleDate2 = sdf.parse("2020-10-10 14:20:00");


    /*Method 3: compare dates using Calendar class*/
    Calendar cal1 = Calendar.getInstance();
    cal1.set(2020, 2, 20, 10, 30, 45);

    Calendar cal2 = Calendar.getInstance();
    cal2.set(2020, 12, 18, 14, 22, 30);


    /**
     * PART II: compare date & time
     */
    //Method 1: compare dates and times using LocalDateTime */
    LocalDateTime dateTime1 = LocalDateTime.now();
    LocalDateTime dateTime2 = LocalDateTime.of(2020, 1, 31, 10, 15, 45);

    //Method 2: compare dates and times using ZoneDateTime */
    ZonedDateTime zoneDate1 = ZonedDateTime.of(
        LocalDateTime.of(2020, 1, 31, 10, 30, 45),
        ZoneId.of("America/New_York"));
    ZonedDateTime zoneDate2 = ZonedDateTime.of(
        LocalDateTime.of(2020, 1, 31, 10, 30, 45),
        ZoneId.of("Europe/Paris"));

    /**
     * PART III: compare time
     */
    //Method 1: compare times using LocalTime */
    LocalTime time1 = LocalTime.of(15, 20, 40);
    LocalTime time2 = LocalTime.of(10, 30, 50);
  }
}
