package com.shashank.employeeboss;

public class Boss {
    private String name;
    private int age;
    private float rating;
    private int salary;

    public Boss(String name, int age, float rating, int salary) {
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.salary = salary;
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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
