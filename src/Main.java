// Main.java
public class Main {
    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create and add patients
        Patient p1 = new Patient(1, "Alice", 30, "Flu");
        Patient p2 = new Patient(2, "Bob", 45, "Diabetes");
        Patient p3 = new Patient(3, "Charlie", 25, "Flu");

        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        // Create and add doctors
        Doctor d1 = new Doctor(1, "Dr. Smith", "Cardiology");
        Doctor d2 = new Doctor(2, "Dr. Brown", "Neurology");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        // Display details
        hospital.displayDetails();

        // Filter patients by diagnosis
        System.out.println("\nPatients with Flu:");
        hospital.filterPatientsByDiagnosis("Flu").forEach(System.out::println);

        // Search doctors by specialization
        System.out.println("\nDoctors with specialization in Neurology:");
        hospital.searchDoctorsBySpecialization("Neurology").forEach(System.out::println);

        // Sort patients by name and display
        System.out.println("\nPatients sorted by name:");
        hospital.sortPatientsByName();
        hospital.displayDetails();
    }
}

