package org.java8.complexpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8OpsOnEmployee {

    public static void main(String[] args) {

        Department enginDept = new Department(1, "Engineering");
        Department finDept = new Department(2, "Finance");
        Department hrDept = new Department(3, "Human Resource");
        Department agriDept = new Department(4, "Agriculture");

        Employee emp1 = new Employee(1, "Peter", 35000L, agriDept);
        Employee emp2 = new Employee(2, "Henry", 55000L, finDept);
        Employee emp3 = new Employee(3, "Javed", 65000L, hrDept);
        Employee emp4 = new Employee(4, "Akbar", 15000L, enginDept);
        Employee emp5 = new Employee(5, "Khalsa", 25000L, hrDept);
        Employee emp6 = new Employee(6, "David", 30000L, finDept);
        Employee emp7 = new Employee(7, "Bernard", 32000L, enginDept);
        Employee emp8 = new Employee(8, "Kailem", 89000L, finDept);

        Java8OpsOnEmployee java8OpsOnEmployee = new Java8OpsOnEmployee();
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(emp1);employeeList.add(emp2);employeeList.add(emp3);employeeList.add(emp4);
        employeeList.add(emp5);employeeList.add(emp6);employeeList.add(emp7);employeeList.add(emp8);
        //java8OpsOnEmployee.nameOfTheEmpSalaryGrtThanFiftyK(employeeList);
        //java8OpsOnEmployee.nameOfTheEmpSepratedByComma(employeeList);
        //java8OpsOnEmployee.sumOfSalaryByDept(employeeList);
        java8OpsOnEmployee.searchUniqueSalary(employeeList);
    }

    public void nameOfTheEmpSalaryGrtThanFiftyK(List emList){
        Stream<Employee> stream = emList.stream();
        System.out.println("Salary greater than 50000 are :");
          List<String> list = stream
                                .filter(emp -> emp.geteSalary()>50000L)
                                .map(emp -> emp.getEmpName() + " : " + emp.geteSalary())
                                .collect(Collectors.toList());
          list.forEach(System.out::println);
    }

    public void nameOfTheEmpSepratedByComma(List emList){
        Stream<Employee> stream = emList.stream();
        System.out.print("names of Employees separated by comma are :");
        String str = stream
                .map(emp -> emp.getEmpName())
                .collect(Collectors.joining(", "));
        System.out.println(str);
    }

    public void sumOfSalaryByDept(List emList){
        Stream<Employee> stream = emList.stream();
        System.out.println("sum of salaries by department :");
        Map<String, Long> salaryByDepartment = stream
                .collect(Collectors.groupingBy(emp -> emp.geteDept().getdName(),
                        Collectors.summingLong(Employee::geteSalary)));
        salaryByDepartment.forEach((deptName, sumOfSalary) -> System.out.println(deptName + ": " +sumOfSalary));
    }

    public void searchUniqueSalary(List emList){
        Stream<Employee> stream = emList.stream();
        System.out.print("names of Employees separated by comma are :");

        stream
                .map(emp -> emp.geteSalary())
                .distinct()
                .sorted((a,b) -> b.compareTo(a))
                .limit(3)
                .forEach(System.out::println);
    }
}
