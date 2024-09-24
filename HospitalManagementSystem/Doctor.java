package HospitalManagementSystem;

public class Doctor {
    private int doctorID;
    private String name;
    private Hospital hospital;

    public Doctor(int doctorID, String name, Hospital hospital) {
        this.doctorID = doctorID;
        this.name = name;
        this.hospital = hospital;
        hospital.addDoctor(this);  
    }

    public int getDoctorID() {
        return doctorID;
    }

    public String getName() {
        return name;
    }

    public Hospital getHospital() {
        return hospital;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + this.doctorID + ", Name: " + this.name + ", Hospital: " + this.hospital.getName();
    }
}
