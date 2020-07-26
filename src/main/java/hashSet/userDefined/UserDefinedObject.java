package hashSet.userDefined;

import java.util.HashSet;
import java.util.Set;

public class UserDefinedObject {
  public static void main(String[] args) {
    Set<Customer> customers = new HashSet<>();
    customers.add(new Customer(101, "Peter"));
    customers.add(new Customer(102, "David"));
    customers.add(new Customer(103, "Chris"));

        /*
          HashSet will use the `equals()` & `hashCode()` implementations
          of the Customer class to check for duplicates and ignore them
        */
    customers.add(new Customer(101, "David"));

    System.out.println(customers);
  }
}