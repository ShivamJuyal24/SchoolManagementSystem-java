package Schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Karthik = new Teacher(100,"Karthik", 1000);
        Teacher Yasin = new Teacher(101,"Yasin", 15000);
        Teacher Murali = new Teacher(102, "Murali" , 12000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Karthik);
        teacherList.add(Yasin);
        teacherList.add(Murali);

        Student Jessi = new Student(1,"Jessi", 6);
        Student Jennifer = new Student(2,"Jennifer", 8);
        Student Sri = new Student(21,"Sri",7);

        List<Student> studentList =  new ArrayList<>();
        studentList.add(Jessi);
        studentList.add(Jennifer);
        studentList.add(Sri);

        School Mhs = new School(teacherList, studentList);

        Sri.updatefeespaid(8000);
        Jennifer.updatefeespaid(10000);
        System.out.println("Mhs Earned Money is " + Mhs.getTotalmoneyearned());

        Karthik.receiveSalary(Karthik.getSalary());
        System.out.println("Mhs has spend for salary to " + Karthik.getName() + " and now has " + Mhs.getTotalmoneyearned());

        Murali.receiveSalary(Murali.getSalary());
        System.out.println("Mhs has spend for salary to " + Karthik.getName() + " and now has " + Mhs.getTotalmoneyearned());

        System.out.println(Sri);

        System.out.println(Karthik);
    }
}
