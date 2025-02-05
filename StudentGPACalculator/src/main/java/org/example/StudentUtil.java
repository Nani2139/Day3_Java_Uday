package org.example;
import java.util.ArrayList;
import java.util.List;
public class StudentUtil {

    //Method to Calculate GPA for every ID(Student)
    public static List<Double> calculateGPA(int[] studentIdList, List<List<Character>> studentsGrades) throws MissingGradeException {
        if(studentIdList.length != studentsGrades.size()){
            throw new IllegalArgumentException("studentIdList & studentsGrades are out-of-sync. studentIdList.length: " + studentIdList.length + ", studentsGrades.length: " + studentsGrades.size());
        }
        List<Double> gpaArray = new ArrayList<>();

        for (int i = 0; i < studentIdList.length; i++) {
            int totalPoints = 0;
            int numCourses = studentsGrades.get(i).size();

            for (char grade : studentsGrades.get(i)) {
                if (grade == ' ') {
                    throw new MissingGradeException(studentIdList[i]);
                }
                totalPoints += getGradePoints(grade);
            }

            gpaArray.add((double) totalPoints / numCourses);
        }
        return gpaArray;
}

public static List<Integer> getStudentsByGPA(double lower, double higher, int[] studentIdList, List<List<Character>> studentsGrades) {
        if (lower < 0 || higher < 0 || lower > higher) {
            throw new IllegalArgumentException("Lower should be Greater than Higher");
        }
        if(studentIdList.length != studentsGrades.size()){
            throw new IllegalArgumentException("studentIdList & studentGrades are out-of-sync. StudentIdList.length: " + studentIdList.length + ", studentGrades.length: " + studentsGrades.size());
        }
    List<Integer> filteredStudents = new ArrayList<>();
    try {
        List<Double> gpaArray = calculateGPA(studentIdList, studentsGrades);
        for (int i = 0; i < gpaArray.size(); i++) {
            if (gpaArray.get(i) >= lower && gpaArray.get(i) <= higher) {
                filteredStudents.add(studentIdList[i]);
            }
        }
    } catch (MissingGradeException e) {
        throw new InvalidDataException("Invalid data encountered while processing student GPAs", e);
    }
    return filteredStudents;
    }
    //method for returning those grades
    private static int getGradePoints(char grade) {
        if(grade == 'A') return 4;
        else if(grade == 'B') return 3;
        else if(grade == 'C') return 2;
        else throw new IllegalArgumentException("Invalid Grade:"+grade+"Try to input appropriate grade");
    }
}


