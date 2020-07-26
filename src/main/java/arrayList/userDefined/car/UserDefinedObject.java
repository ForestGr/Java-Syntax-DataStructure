package arrayList.userDefined.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sort an ArrayList of Objects using custom Comparator
 */

public class UserDefinedObject {

  public static void main(String[] args) {
    List<Car> list = new ArrayList<>();

    list.add(new Car("Volvo V40", "XYZ 201845", 5));
    list.add(new Car("Citroen C1", "ABC 164521", 4));
    list.add(new Car("Dodge Ram", "KLM 845990", 2));

    System.out.println("list before sort: " + list);
    /**
     * If the objects in the Java List do not implement the Comparable interface,
     * or if you want to sort the objects in another order than their compare() implementation,
     * then you need to use a Comparator implementation (java.util.Comparator).
     */

    //m1: self-defined comparator
    Comparator<Car> carBrandComparator = new Comparator<Car>() {
      @Override
      public int compare(Car car1, Car car2) {
        return car1.brand.compareTo(car2.brand);
      }
    };
    Collections.sort(list, carBrandComparator);
    System.out.println("list aft sort by brand: " + list);

    //m2: Lambda
    Comparator<Car> carNumPlatComparatorLambda =
        (car1, car2) -> car1.numPlate.compareTo(car2.numPlate);
    Collections.sort(list, carNumPlatComparatorLambda);
    System.out.println("list aft sort by plate number: " + list);

    Comparator<Car> carNoOfDoorsComparatorLambda  =
        (car1, car2) -> car1.noOfDoors - car2.noOfDoors;
    Collections.sort(list, carNoOfDoorsComparatorLambda);
    System.out.println("list aft sort by numbers of door: " + list);
  }
}
