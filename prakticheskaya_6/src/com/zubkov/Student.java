package com.zubkov;

import java.io.Serializable;
import java.util.Random;

import static java.lang.Math.abs;
import static java.lang.String.*;

public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    Random rand = new Random();
    private int score;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.score = abs(rand.nextInt()%101);
    }


    public int compareByAge(Student other){
        return Integer.compare(this.age, other.age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return format("%s %s (%d years) score: %d", firstName, lastName, age, score);
    }
}

