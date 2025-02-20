package University;

public class Professor extends UniversityStaff{
    private String specialization;

    public Professor(String name,int staffID, String department,String specialization){
        super(name,staffID,department);
        this.specialization = specialization;
    }
    public void displayRole() {
        System.out.println("Professor: " + name);
        System.out.println("Specialization : "+specialization);
    }
}