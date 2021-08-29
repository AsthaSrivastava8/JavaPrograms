package educative.lambda;

import com.sun.javafx.binding.StringFormatter;

import java.util.*;

public class StudentAvgScore {

    public static void main(String[] args) {
        Student s1 = new Student(1, 9, "Ramesh");
        Student s2 = new Student(2, 7, "Sanjana");
        Student s3 = new Student(3, 10, "Mahesh");

        List<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(s1, s2, s3));

        OptionalDouble avg = students.stream().mapToDouble(e -> e.getScore()).average();
        System.out.println(avg.getAsDouble());

    }

}

class Student {
    public Student(int id, int score, String name) {
        this.id = id;
        this.score = score;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private float score;
    private String name;


}