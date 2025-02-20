package University;
import java.io.*;
import java.util.Scanner;

public class UniversityManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating required files before calling methods
        String[] fileNames = {"students.txt", "courses.txt", "staff.txt"};
        for (String fileName : fileNames) {
            try {
                File file = new File(fileName);
                if (file.createNewFile()) {
                    System.out.println("File created: " + fileName);
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + fileName);
            }
        }

        while (true) {
            System.out.println("\nUniversity Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Professor");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. Conduct Offline Course");
            System.out.println("5. Conduct Online Course");
            System.out.println("6. Display File Content");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String studentName = sc.nextLine();
                    System.out.print("Enter Student ID: ");
                    int studentID = sc.nextInt();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    Student student = new Student(studentName, studentID, age);
                    student.displayInfo();
                    ReportGenerator.saveToFile("students.txt", studentName + ", " + studentID + ", " + age);
                    break;

                case 2:
                    System.out.print("Enter Professor Name: ");
                    String professorName = sc.nextLine();
                    System.out.print("Enter Staff ID: ");
                    int staffID = sc.nextInt();
                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = sc.nextLine();
                    Professor professor = new Professor(professorName, staffID, department, specialization);
                    professor.displayRole();
                    ReportGenerator.saveToFile("staff.txt", professorName + ", " + staffID + ", " + department + ", " + specialization);
                    break;

                case 3:
                    System.out.print("Enter Student Name: ");
                    String enrolledStudent = sc.nextLine();
                    System.out.print("Enter Student ID: ");
                    int enrolledID = sc.nextInt();
                    Course course = new OfflineCourse();
                    course.enrollStudent(enrolledStudent, enrolledID);
                    ReportGenerator.saveToFile("courses.txt", enrolledStudent + " enrolled in a course.");
                    break;

                case 4:
                    Course offlineCourse = new OfflineCourse();
                    ((OfflineCourse) offlineCourse).conductClass();
                    break;
                case 5:
                    Course onlineCourse = new OnlineCourse();
                    ((OnlineCourse) onlineCourse).conductClass();
                    break;
                case 6:
                    System.out.println("\nContents of Students File:");
                    ReportGenerator.readFromFile("students.txt");
                    System.out.println("\nContents of Courses File:");
                    ReportGenerator.readFromFile("courses.txt");
                    System.out.println("\nContents of Staff File:");
                    ReportGenerator.readFromFile("staff.txt");
                    break;

                case 7:
                    System.out.println("Exiting University Management System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}