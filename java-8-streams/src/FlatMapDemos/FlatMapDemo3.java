package FlatMapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int sid;
    char grade;

    public Student(String name, int sid, char grade) {
        this.name = name;
        this.sid = sid;
        this.grade = grade;
    }
}

public class FlatMapDemo3 {
    public static void main(String[] args) {

        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Smith",101,'A'));
        studentList1.add(new Student("John",102,'B'));
        studentList1.add(new Student("Kenedy",103,'C'));

        List<Student> studentList2 = new ArrayList<Student>();
        studentList2.add(new Student("Scott",104,'A'));
        studentList2.add(new Student("Mary",105,'B'));
        studentList2.add(new Student("Kitty",106,'C'));

        List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);

        // Before Java 8
        for(List<Student>s:studentList){
            for(Student stu : s){
                System.out.println(stu.name);
            }
        }

        // using stream flatMap()
        List<String> studentNames = studentList.stream().flatMap(stuList -> stuList.stream()).map(s->s.name).collect(Collectors.toList());
        System.out.println(studentNames);
    }
}
