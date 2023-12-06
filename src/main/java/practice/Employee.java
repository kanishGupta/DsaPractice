package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {

    private int age;
    private String gender;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(23,"Male", "John");
        Employee e2 = new Employee(20,"Female", "Taru");
        Employee e3 = new Employee(20,"Zale", "Steve");
        Employee e4 = new Employee(45,"Female", "Meloni");
        Employee e5 = new Employee(32,"Male", "Pat");

        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);

        Comparator<Employee> ageCom = Comparator.comparing(e -> e.getAge());
        Comparator<Employee> genderCom = Comparator.comparing(e -> e.getGender());

        Comparator<Employee> comp = ageCom.thenComparing(genderCom);

        list.stream().sorted(comp).forEach(System.out::println);

        Map<Employee, Integer> map = new HashMap<>();
    }
}
