package src.com.streams;

import src.com.functionalInterface.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Mapping helps to form another stream using certain properties of each object in the current stream.
 * map() is an intermediate method.
 * mapToInt(), mapToLong(), mapToDouble() are provided to perform on primitive streams.
 * flatMap() handles situations where each element in current stream is mapped more than one element in resultant stream.
 */
public class Mapping {
    public static class Student{
        String name;
        int rollNumber;
        public Student(String name, int rollNumber){
            this.name = name;
            this.rollNumber = rollNumber;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("A", 10));
        students.add(new Student("B", 20));
        students.add(new Student("C", 30));

        // map roll numbers from student and collect them as list.
        List<Integer> rollNumbers = students.stream().map((student -> student.rollNumber)).collect(Collectors.toList());

        // map names from student and collect them as set.
        Set<String> names = students.stream().map((student -> student.name)).collect(Collectors.toSet());

        // Since map() is intermediate operation, we can chain it.
        students.stream().map((student -> student.rollNumber))
                        .filter((rollNumber)->rollNumber>10)
                        .forEach(System.out::println); // displays 20 30
        IntStream stream = students.stream().mapToInt((student -> (int)Math.ceil(Math.sqrt(student.rollNumber))));
        stream.forEach(System.out::println); // displays 4 5 6
    }
}
