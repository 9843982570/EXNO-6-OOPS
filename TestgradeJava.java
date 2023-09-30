
package testgrade.java;
        import java.util.Scanner;

public class TestgradeJava{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store student IDs and grades
        String[] studentIDs = {"001", "002", "003", "004", "005", "006", "007", "008", "009", "010"};
        char[] studentGrades = new char[studentIDs.length];
        
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.print("Enter test letter grade for student " + studentIDs[i] + ": ");
            char grade = scanner.next().toUpperCase().charAt(0);
            
            try {
                validateGrade(grade); // Check if the grade is valid
                studentGrades[i] = grade;
            } catch (gradeexception e) {
                System.out.println("Invalid grade entered for student " + studentIDs[i] + ". Setting grade to 'I'.");
                studentGrades[i] = 'I';
            }
        }
        
        scanner.close();
        
        System.out.println("\nStudent IDs and Grades:");
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println("Student ID: " + studentIDs[i] + ", Grade: " + studentGrades[i]);
        }
    }

    public static void validateGrade(char grade) throws gradeexception {
        for (char validGrade : gradeexception.VALID_GRADES) {
            if (grade == validGrade) {
                return; // Grade is valid, no exception
            }
        }
        throw new gradeexception("Invalid grade: " + grade);
    }
}
    
    

