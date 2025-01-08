// Patient.java
public class Patient {
    private int id;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(int id, String name, int age, String diagnosis) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Patient{id=" + id + ", name='" + name + "', age=" + age + ", diagnosis='" + diagnosis + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Patient)) return false;
        Patient other = (Patient) obj;
        return id == other.id && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
}
