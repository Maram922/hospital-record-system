package hospital.reception;

import hospital.staff.Staff;
import hospital.medical.Patient;

public class Receptionist extends Staff {
    public Receptionist(String name, String staffId) {
        super(name, staffId);
    }

    public String viewPatientDetails(Patient patient) {
        return "Patient: " + patient.getPatientName() + " | Appointment: " + patient.getAppointmentDate();
    }
}
