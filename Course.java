package University;

public class Course {

    public void enrollStudent(String studentName) {
        System.out.println(studentName + " has been enrolled.");
    }
    public void enrollStudent(String studentName, int studentID) {
        System.out.println("Student " + studentName + " (ID: " + studentID + ") has been enrolled.");
    }
}
class OnlineCourse extends Course {
    public void conductClass() {
        System.out.println("Conducting class online.");
    }
}

class OfflineCourse extends Course {
    public void conductClass() {
        System.out.println("Conducting class offline at university.");
    }
}