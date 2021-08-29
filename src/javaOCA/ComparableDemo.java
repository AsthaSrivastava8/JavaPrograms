package javaOCA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    long salary;

    public Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(getId(), o.getId());
    }

    @Override
    public String toString() {
        return (this.getId() + " " + this.getName() + " " + this.getSalary());
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Arijit", 123));
        employees.add(new Employee(4, "Shreya", 543));
        employees.add(new Employee(2, "Farhan", 234));
        employees.add(new Employee(1, "Amit", 973));

        for (Employee employee : employees) {
            System.out.print(employee.toString() + " ");
        }
        Collections.sort(employees);

        System.out.println();
        for (Employee employee : employees) {
            System.out.print(employee.toString() + " ");
        }

    }
}
