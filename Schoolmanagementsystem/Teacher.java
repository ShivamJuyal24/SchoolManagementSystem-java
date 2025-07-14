package Schoolmanagementsystem;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryearned;

    public Teacher(int id, String name, int salary){
        this.id =  id ;
        this.name = name;
        this.salary=salary;
        this.salaryearned=0;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return  name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int sal){
        this.salary = sal;
    }

    public void receiveSalary(int salary){
        salaryearned +=salary;
        School.updateTotalmoneyspend(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher is " + name + "Total salary earned " + salaryearned;
    }
}
