package Schoolmanagementsystem;

import java.util.List;

public class School {
    private List<Teacher> teacher;
    private List<Student> student;

    private static int Totalmoneyearned;
    private  static int Totalmoneyspend;

    public School(List<Teacher> teachers, List<Student> students){
        this.teacher = teachers;
        this.student =students;
        Totalmoneyearned=0;
        Totalmoneyspend=0;
    }

    public List<Teacher> getTeacher(){
        return teacher;
    }
    public void addTeacher(Teacher teachers){
         teacher.add(teachers);
    }

    public List<Student> getStudent(){
        return student;
    }
    public void addStudent(Student students){
         student.add(students);
    }
    public static void updateTotalmoneyearned(int moneyearned){
        Totalmoneyearned += moneyearned;
    }
    public int getTotalmoneyearned(){
        return Totalmoneyearned;
    }

    public  int  getTotalmoneyspend(){
        return Totalmoneyspend;
    }
    public  static  void  updateTotalmoneyspend(int moneyspend){
        Totalmoneyspend -= moneyspend;
    }
}
