package com.shashank.employeeboss;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private float rating;
    private String boss;

    public Employee(String name, int age, int salary, float rating, String boss) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.rating = rating;
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }
}
