package com.zubkov;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student ivan = new Student("Иван", "Ивнов", 19);
        Student vasya = new Student("Василий", "Петров", 19);
        Student anton = new Student("Антон", "Васильев", 20);
        Student sergey = new Student("Сегрей", "Фролов", 19);
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(ivan, vasya, anton, sergey));
        students.forEach(System.out::println);
        sort(students);
        System.out.println();
        students.forEach(System.out::println);
    }

    private static void sort(ArrayList<Student> students) {
        var comp = new SortStudentsByGPA();
        students.sort(comp);
    }
}
