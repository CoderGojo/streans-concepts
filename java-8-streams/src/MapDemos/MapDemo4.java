package MapDemos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empid;
    String empname;
    int salary;

    public Employee(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

public class MapDemo4 {

    public static void main(String[] args) {

        /*List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(101,"Alex",10000));
        employeesList.add(new Employee(102,"Carlos",10000));
        employeesList.add(new Employee(103,"ABD",10000));
        employeesList.add(new Employee(104,"Stark",10000));
        employeesList.add(new Employee(105,"Vision",10000));*/

        List<Employee> employeeList = Arrays.asList(
                new Employee(101,"Alex",10000),
                new Employee(102,"Carlos",20000),
                new Employee(103,"ABD",10000),
                new Employee(104,"Stark",40000),
                new Employee(105,"Vision",50000)
        );

        // Combination of filter and map
       List<Integer> employeeSalList = employeeList.stream()
                .filter(e -> e.salary >20000) //filtering
                .map(e->e.salary)
                .collect(Collectors.toList());

       System.out.println(employeeSalList);
    }
}
