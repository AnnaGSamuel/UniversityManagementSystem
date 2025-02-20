package University;

public class Student {
    private String name;
    private int studentID;
    private int age;

    public Student(String name, int studentID, int age) {
        this.name = name;
        this.studentID = studentID;
        try{
            setAge(age);
        }
        catch (InvalidAgeException e){
            System.out.println("Exception : "+e.getMessage());
        }

    }
    //Getter methods
    public String getName(){
        return name;
    }
    public int getStudentID() {
        return studentID;
    }
    public int getAge(){
        return age;
    }
    //Setter method
    public void setAge(int age) throws InvalidAgeException{
        if(age>0)
            this.age = age;
        else
            throw new InvalidAgeException("Age must be greater tha zero!");
    }
    public void displayInfo(){
        System.out.println("University.Student Details :");
        System.out.println("University.Student ID : "+getStudentID());
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
    }
}