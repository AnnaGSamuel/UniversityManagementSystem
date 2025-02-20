package University;

public class AdminStaff extends UniversityStaff{
    private String role;

    public AdminStaff(String name,int staffID, String department,String role){
        super(name,staffID,department);
        this.role = role;
    }

    public void displayRole(){
        System.out.println("Admin staff : "+name);
        System.out.println("Role : "+role);
    }
}