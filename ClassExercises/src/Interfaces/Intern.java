package Interfaces;

public class Intern extends Student implements Employee{
    private final double income;

    public Intern(String name,String course){
        super(name, course);
        this.income = starting_salary;
    }

    @Override
    public double getSalary() {
        return income;
    }
}
