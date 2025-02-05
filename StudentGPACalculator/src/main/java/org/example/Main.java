package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int[] studentIdList = {1001, 1002,1003};
        List<List<Character>> studentsGrades = new ArrayList<>();
        studentsGrades.add(Arrays.asList('A', 'A', 'A', 'B'));
        studentsGrades.add(Arrays.asList('A', 'B', 'B'));
        studentsGrades.add(Arrays.asList('A','C',' '));
        try {
            List<Double> gpaResults = StudentUtil.calculateGPA(studentIdList, studentsGrades);
            System.out.println("GPA Results: " + gpaResults);
        } catch (MissingGradeException e) {
            System.out.println("Exception caught in Main: " + e.getMessage());
        }
        try {
            List<Integer> filteredStudents = StudentUtil.getStudentsByGPA(3.2, 3.5, studentIdList, studentsGrades);
            System.out.println("Students in GPA range: " + filteredStudents);
        } catch (InvalidDataException e) {
            System.out.println("Caught InvalidDataException: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
        }
    }
}