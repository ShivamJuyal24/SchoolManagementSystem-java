package Schoolmanagementsystem;
// This class is Responsible for tracking the student details
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    /*
    Fees for every student is 30,000/
    Fees paid Initially 0
     */
    public Student(int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void updatefeespaid(int fees){
        feesPaid +=fees;
        School.updateTotalmoneyearned(feesPaid);
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }

    public int getFeesPaid(){
        return feesPaid;
    }
    public int getFeesTotal(){
        return feesTotal;
    }

     public int getRemaining(){
        return feesTotal - feesPaid;
     }

     @Override
    public String toString(){
        return "Student's name : " + name + " Total fees paid so far " + feesPaid ;
     }




}
