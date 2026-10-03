package hospital.medical;


import hospital.staff.Staff;

public class Doctor extends Staff {
    private String shift = "Not assigned";

    public Doctor(String name, String staffId) {
        super(name, staffId);
    }

    public void setShift(String shift) {
        this.shift = shift;
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
