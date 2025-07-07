import java.util.Scanner;

public class StudentGradeManagementSystem {
    // Function to calculate total marks
    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Function to calculate average marks
    public static double calculateAverage(int total, int subjects) {
        return (double) total / subjects;
    }

    // Function to determine grade
    public static String calculateGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        int[][] marks = new int[n][3];

        // Input student names and marks
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.println("Enter marks for 3 subjects:");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
            sc.nextLine(); // consume newline
        }

        // Display result summary
        System.out.println("\n--- Student Result Summary ---");
        for (int i = 0; i < n; i++) {
            int total = calculateTotal(marks[i]);
            double average = calculateAverage(total, 3);
            String grade = calculateGrade(average);

            System.out.println("\nStudent: " + names[i]);
            System.out.println("Total Marks: " + total);
            System.out.printf("Average: %.2f\n", average);
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}
