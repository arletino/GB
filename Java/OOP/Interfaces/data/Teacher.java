package Java.OOP.Interfaces.data;


public class Teacher extends User implements Comparable<Teacher> {
    private String specialty;
    int teacherId;
    public Teacher(int teacherId, String firstName, String secondName, String lastName, String specialty) {
        super(firstName, secondName, lastName);
        //TODO Auto-generated constructor stub
        this.specialty = specialty;
        this.teacherId =teacherId;
    }
    
    
    
    @Override
    public int compareTo(Teacher o) {
        // TODO Auto-generated method stub
        return this.getTeacherId() - o.getTeacherId();
    }

    @Override
    public String toString() {
            return "Teacher: {" +
                    "teacherId='" + teacherId + '\'' + 
                    "firstName='" + super.getFirstName() + '\'' +
                    ", secondName='" + super.getSecondName() + '\'' +
                    ", lastName='" + super.getLastName() + '\'' + 
                    ",specialty='" + specialty + '\'' + 
                    '}';
        }


    public String getSpecialty() {
        return specialty;
    }


    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }


    public int getTeacherId() {
        return teacherId;
    }


    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
