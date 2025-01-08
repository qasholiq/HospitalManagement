// Hospital.java
import java.util.ArrayList;

public class Hospital {
    private String name;
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;

    public Hospital(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }
}
