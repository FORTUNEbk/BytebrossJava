package HospitalManagementSystem;// Hospital.java
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public String getName() {
        return name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
