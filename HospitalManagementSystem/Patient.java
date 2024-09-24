package HospitalManagementSystem;

public class Patient {
    private int patientID;
    private String name;
    private Doctor doctor;  

    public Patient(int patientID, String name, Doctor doctor) {
        this.patientID = patientID;
        this.name = name;
        this.doctor = doctor;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "Patient ID: " + this.patientID + ", Name: " + this.name + ", Doctor: " + this.doctor.getName();
    }
}
