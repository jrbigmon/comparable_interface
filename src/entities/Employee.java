package entities;

public class Employee implements Comparable<Employee> {
  private String name;
  private Double salary;

  public Employee(String name, Double salary) {
    this.name = name;
    this.salary = salary;
  }

  public Employee() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Name: " + name + " - " + "Salary: " + salary;
  }

  @Override
  public int compareTo(Employee o) {
    // return -getName().compareTo(o.getName()); //desc
    return getName().compareTo(o.getName()); // asc
  }
}
