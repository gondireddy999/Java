

package org.gmr.lambda.session4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnnonymousInnerclassExample1 {

  public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee("Malli", 20));
    employeeList.add(new Employee("Sekhar", 21));
    employeeList.add(new Employee("Rajeev", 10));
    employeeList.add(new Employee("Mama", 30));
    employeeList.add(new Employee("Balu", 01));
    System.out.println(employeeList);

    Collections.sort(employeeList, (e1,e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);

    System.out.println("Sort by employee number" + employeeList);

    Collections.sort(employeeList, (e1,e2) -> e1.name.compareTo(e2.name));
    //OR  we can go with Comparator.comparing

    //Collections.sort(employeeList, Comparator.comparing(e -> e.name));

    System.out.println("Sort by employee name" + employeeList);



  }

}

class Employee {

  String name;
  int eno;

  public Employee(String name, int eno) {
    this.name = name;
    this.eno = eno;
  }


  @Override
  public String toString() {
    return eno + ":" + name;
  }
}
