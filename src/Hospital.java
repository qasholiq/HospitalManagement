// Hospital.java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
    private String name;
    private List<Patient> patients;
    private List<Doctor> doctors;

    // Constructor
    public Hospital(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    // Methods to add patients and doctors
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Filter patients by diagnosis
    public List<Patient> filterPatientsByDiagnosis(String diagnosis) {
        return patients.stream()
                .filter(p -> p.getDiagnosis().equalsIgnoreCase(diagnosis))
                .collect(Collectors.toList());
    }

    // Search doctors by specialization
    public List<Doctor> searchDoctorsBySpecialization(String specialization) {
        return doctors.stream()
                .filter(d -> d.getSpecialization().equalsIgnoreCase(specialization))
                .collect(Collectors.toList());
    }

    // Sort patients by name
    public void sortPatientsByName() {
        patients.sort(Comparator.comparing(Patient::getName));
    }

    // Display hospital details
    public void displayDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Patients:");
        patients.forEach(System.out::println);
        System.out.println("Doctors:");
        doctors.forEach(System.out::println);
    }
}

