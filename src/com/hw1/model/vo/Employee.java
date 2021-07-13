package com.hw1.model.vo;

public class Employee extends Person{

    private int salary;
    private String dept;

    public Employee() {
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String information() {
        return "이름='" + name + '\'' +
                ", 부서=" + getDept() +
                ", 나이=" + getAge() +
                ", 몸무게=" + getWeight() +
                ", 신장=" + getHeight() +
                ", 급여='" + getSalary() + '\''
                ;
    }
}
