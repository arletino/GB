package Java.OOP.SOLID.model;

public class Student extends User { // Применен принцип OCP и DIP
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
        //TODO Auto-generated constructor stub
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    @Override
    public String toString() {
        return "Student {"+ 
            "studentId=" + studentId + "\'" + 
            "firstName=" + super.getFirstName() + "\'" +
            ", secondName=" + super.getSecondName() + "\'" + 
            ", lastName=" + super.getLastName() +  "\'" +
            "}";
    }
}
