package com.zubkov;

import java.util.ArrayList;
import java.util.Comparator;

public class SortStudentsByGPA implements Comparator {
    SortStudentsByGPA(){}
    @Override
    public int compare(Object student1, Object student2) {
        return Integer.compare(((Student) student2).getScore(), ((Student) student1).getScore());
    }

}
