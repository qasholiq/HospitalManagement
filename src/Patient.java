// Patient.java
public class Patient extends Person {
    private int age;
    private String diagnosis;

    // Constructor
    public Patient(int id, String name, int age, String diagnosis) {
        super(id, name);
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return super.toString() + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }
}

