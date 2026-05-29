package dz26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Main26 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Анна", "A1", 1,
                new ArrayList<Integer>() {{
                    add(5);
                    add(4);
                    add(3);
                }}));
        students.add(new Student("Иван", "A1", 1,
                new ArrayList<Integer>() {{
                    add(2);
                    add(3);
                    add(2);
                }}));
        students.add(new Student("Мария", "B2", 2,
                new ArrayList<Integer>() {{
                    add(4);
                    add(5);
                    add(5);
                }}));
        removeBadStudents(students);
        for (Student student : students) {
            student.nextCourse();
        }
        printStudents(students, 2);
    }
    public static void removeBadStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.averageGrade() < 3) {
                iterator.remove();
            }
        }
    }
    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }
}