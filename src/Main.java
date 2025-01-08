// Main.java
public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Patient p1 = new Patient(1, "Alice", 30, "Flu");
        Patient p2 = new Patient(2, "Bob", 45, "Diabetes");

        Doctor d1 = new Doctor(1, "Dr. Smith", "Cardiology");
        Doctor d2 = new Doctor(2, "Dr. Brown", "Neurology");

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.showDetails();
    }
}
