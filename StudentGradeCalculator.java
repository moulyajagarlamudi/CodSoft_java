import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Student grade Calculator***");
        System.out.print("Enter the number of the subjects: ");
        int s = sc.nextInt();

        int totalMarks = 0;
        for(int i = 1; i <= s; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double AP= (double) totalMarks / s;

        String grade;
        if(AP >= 90) {
            grade = "O";
        } else if(AP >= 80) {
            grade = "A";
        } else if(AP >= 70) {
            grade = "B";
        } else if(AP >= 60) {
            grade = "C";
        } else if(AP>= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + AP);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
