package javaOCA;
// Program to demonstrate a repeatable annotation

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Make Words annotation repeatable
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnotations.class)
@interface Words {

    String word() default "Hello";
    int value() default 0;
}

// Create container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnotations {

    Words[] value();
}

public class Annotations {

    @Words(word = "First", value = 1)
    @Words(word = "Second", value = 2)
    public static void newMethod() {

        Annotations annotations = new Annotations();
        try {
            Class<?> annotationsClass = annotations.getClass();
            Method method = annotationsClass.getMethod("newMethod");
            Annotation annotation = method.getAnnotation(MyRepeatedAnnotations.class);
            System.out.println(annotation);
        } catch (NoSuchMethodException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        newMethod();
    }
}
