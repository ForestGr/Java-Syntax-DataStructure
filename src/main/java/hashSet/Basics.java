package hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Basics {
  public static void main(String[] args) {
    /**
     * 1. Create set and add elements
     */

    // Creating a HashSet
    Set<String> earlyWeek = new HashSet<>();
    // Adding new elements to the HashSet
    earlyWeek.add("Monday");
    earlyWeek.add("Tuesday");
    earlyWeek.add("Wednesday");

    Set<String> lateWeek = new HashSet<>();
    lateWeek.add("Thursday");
    lateWeek.add("Friday");
    lateWeek.add("Saturday");
    lateWeek.add("Sunday");

    //Creating a HashSet from another collection (Set)
    Set<String> daysSet = new HashSet<>(earlyWeek);

    //Adding all elements from an existing collection(Set) to a HashSet
    daysSet.addAll(lateWeek);
    System.out.println("All days of the week: " + daysSet);

    //Adding duplicate elements will be ignored
    daysSet.add("Monday");

    System.out.println("set from 2 sets: " + daysSet);

    //Creating a HashSet from a list or
    // adding all elements from a list to a Set is same as above
    List<String> earlyList = Arrays.asList("Mon", "Tue", "Wed");
    List<String> lateList = Arrays.asList("Thu", "Fri", "Sat", "Sun");
    Set<String> wholeSet = new HashSet<>(earlyList);
    wholeSet.addAll(lateList);
    System.out.println("set from 2 lists: " +wholeSet);

    //contains(obj)
    wholeSet.contains("day");

    /**
     * 2. Remove elements: remove(obj), removeAll(subset name), removeIf(condition)
     */
    boolean isRemoved = daysSet.remove("Sunday");
    System.out.println("Aft remove(Sunday) " + daysSet);
    daysSet.removeAll(lateWeek);
    System.out.println("Aft remove subset: " + daysSet);
    daysSet.removeIf(day->daysSet.contains("Monday"));
    System.out.println("Aft remove an ele that meet the condition: " + daysSet);
  }
}
