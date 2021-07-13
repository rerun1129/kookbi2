package com.hw1.model.vo;

public class Student extends Person {

    private int grade;
    private String major;

    public Student() {
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        this.name = name;
        this.grade = grade;
        this.major = major;
    }



    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }



    @Override
    public String information() {
        return "이름='" + name + '\'' +
                ", 학년=" + grade +
                ", 나이=" + getAge() +
                ", 몸무게=" + getWeight() +
                ", 신장=" + getHeight() +
                ", 전공='" + major + '\''
                ;
    }
}
