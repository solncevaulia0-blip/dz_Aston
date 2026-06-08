package dz26;

import java.util.ArrayList;
import java.util.List;
public class Student {

  
    public String name
    private String group;
    public int course;
    private List<Integer> grades;
    
    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    
    public double averageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    
    public void nextCourse() {
        if (averageGrade() >= 3) {
            course++;
        }
    }
}
