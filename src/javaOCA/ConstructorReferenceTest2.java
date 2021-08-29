package javaOCA;


import java.util.function.BiFunction;

@FunctionalInterface
interface MyFunctionalInterface {
    Student getStudent(int id, String name);
}
public class ConstructorReferenceTest2 {
    public static void main(String[] args) {
        MyFunctionalInterface mf = Student::new;    //  Constructor Reference

        BiFunction<Integer, String, Student> f1 = Student::new;
        BiFunction<Integer, String, Student> f2 = (id, name) -> new Student(id,name);

        System.out.println(mf.getStudent(101, "Adithya").getId());
        System.out.println(f1.apply(111, "Jai").getId());
        System.out.println(f2.apply(121, "Jai").getId());
    }
}

// Student class
class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}