package hospital.medical;


import hospital.staff.Staff;

public class Doctor extends Staff {
    public Doctor(String name, String staffId) {
        super(name, staffId);
    }

    public String viewDiagnosis(Patient patient) {
        return patient.getDiagnosis();
    }

    public void updateDiagnosis(Patient patient, String newDiagnosis) {
        patient.updateDiagnosis(newDiagnosis);
    }

    public String getDoctorDetails() {
        return "Doctor: " + name + " (ID: " + staffId + ")";
    }
}
