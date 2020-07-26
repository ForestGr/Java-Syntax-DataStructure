package hashMap.userDefined;

import java.util.HashMap;
import java.util.Map;

public class UserDefinedObject {
  public static void main(String[] args) {
    Map<Integer, Employee> employeesMap = new HashMap<>();

    employeesMap.put(1001, new Employee(1001, "Peter", "Melbourne"));
    employeesMap.put(1002, new Employee(1002, "David", "New York"));
    employeesMap.put(1003, new Employee(1003, "Jack", "Paris"));

    System.out.println(employeesMap);
  }
}