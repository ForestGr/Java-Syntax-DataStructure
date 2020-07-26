package dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CurrentDateTime {
  public static void main(String[] args) {
    // Current Date
    LocalDate currentDate = LocalDate.now();
    System.out.println("Current Date: " + currentDate);

    // Current Time
    LocalTime currentTime = LocalTime.now();
    System.out.println("Current Time: " + currentTime);

    // Current Date and Time in a given Timezone
    ZonedDateTime currentNewYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
    System.out.println(currentNewYorkDateTime);
  }
}
