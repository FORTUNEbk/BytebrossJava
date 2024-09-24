package HospitalManagementSystem;

public class Program {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor(1001, "Dr. John Smith", hospital);
        Doctor doctor2 = new Doctor(1002, "Dr. Emily Clark", hospital);

        Patient patient1 = new Patient(2001, "Alice Brown", doctor1);
        Patient patient2 = new Patient(2002, "Bob White", doctor2);

        System.out.println(doctor1);
        System.out.println(patient1);
        System.out.println(doctor2);
        System.out.println(patient2);

        System.out.println("Doctors at " + hospital.getName() + ": " + hospital.getDoctors());
    }
}
