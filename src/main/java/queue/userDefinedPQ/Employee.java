package queue.userDefinedPQ;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getSalary() {
    return salary;
  }

  @Override
  public boolean equals(Object o) {
    /*all the lines are auto generated except the second line changed
     from the ori "if (!(o instanceof Employee)) return false;"*/
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return Double.compare(employee.salary, salary) == 0 &&
        Objects.equals(name, employee.name);
  }

  //auto generated
  @Override
  public int hashCode() {
    return Objects.hash(name, salary);
  }

  //auto generated
  @Override
  public String toString() {
    return "Employee {" +
        "name='" + name + '\'' +
        ", salary=" + salary +
        '}';
  }

  // Compare two employee objects by their salary
  @Override
  public int compareTo(Employee employee) {
    if(this.getSalary() > employee.getSalary()) {
      return 1;
    } else if (this.getSalary() < employee.getSalary()) {
      return -1;
    } else {
      return 0;
    }
  }
}
