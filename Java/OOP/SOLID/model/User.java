package Java.OOP.SOLID.model;

public abstract class User { // Применен принцип SRP
    
    private String firstName;
    private String secondName;
    private String lastName;

    @Override
    public String toString() {
        return "User {"+
            "firstName=" + firstName + "\'" +
            ", secondName=" + secondName + "\'" + 
            ", lastName=" + lastName +  "\'" +
            "}";
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }
}
