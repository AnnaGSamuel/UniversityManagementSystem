package University;

interface Researcher {
    public void conductResearch();
}

interface Mentor {
    public void guideStudents();
}
public class Professors extends Professor implements Researcher,Mentor {
    public Professors(String name, int staffID, String department, String specialization) {
        super(name, staffID, department, specialization);
    }
    public void conductResearch(){
        System.out.println(name+" conducts research");
    }
    public void guideStudents(){
        System.out.println(name+" guides students");
    }
}