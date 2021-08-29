package gfg.oracle;

import java.util.*;

class Salary {
    public Salary(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    String name;
    int salary;


}

public class SortEmployeesBySalary {
    public static void main(String[] args) {

        Salary[] salaries = new Salary[2];
        salaries[0] = new Salary("xbnnskd", 50);
        salaries[1] = new Salary("geek", 50);

        Arrays.sort(salaries, (a, b) -> {
            if (a.salary == b.salary)
                return a.name.compareTo(b.name);
            return Integer.compare(a.salary, b.salary);
        });

        for (Salary salary : salaries) {
            System.out.print(salary.name + " " + salary.salary + " ");
        }

    }

}
