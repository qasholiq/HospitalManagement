// Doctor.java
public class Doctor extends Person {
    private String specialization;

    // Constructor
    public Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization;
    }
}

