//Hi, I am Pradeep and this is my 1st Java project assigned by CodeAlpha
//Task 1:- Student grade analyzer


import java.util.ArrayList;  //to store data
import java.util.Collections; //for coalculating highest, lowest and average grade
import java.util.Scanner; //input operation

public class GradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //creating new object scanner
        ArrayList<Integer> grades = new ArrayList<>(); //creating new int arraylist grades

        //taking input from user
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt(); 

        for (int i = 1; i <= numStudents; i++) {
            System.out.println("Enter grade for student " + i + ":");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // calculate average
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;

        // find highest and lowest grades 
        int highest = Collections.max(grades);
        int lowest = Collections.min(grades);

        // Display results
        System.out.println("----------------------");
        System.out.println("Average grade: " + average );
        System.out.println("----------------------");
        System.out.println("Highest grade: " + highest );
        System.out.println("----------------------");
        System.out.println("Lowest grade: " + lowest );
        System.out.println("----------------------");
    }
}
