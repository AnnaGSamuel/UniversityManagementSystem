package University;

abstract class UniversityMember {
    String name;
    int id;

    public UniversityMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void performRole();

    public void showDetails() {
        System.out.println("Name: " + name + "\nID: " + id);
    }
}
class TeachingStaff extends UniversityMember {
    public TeachingStaff(String name, int id) {
        super(name, id);
    }

    public void performRole() {
        System.out.println(name + " is teaching students.");
    }
}
class NonTeachingStaff extends UniversityMember {
    public NonTeachingStaff(String name, int id) {
        super(name, id);
    }

    public void performRole() {
        System.out.println(name + " is managing university operations.");
    }
}


