package hospital.medical;

public class Patient {
    private String patientName;
    private String patientId;
    private String appointmentDate;
    private String diagnosis;

    public Patient(String patientName, String appointmentDate, String diagnosis, String patientId) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
        this.diagnosis = diagnosis;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    String getDiagnosis() {
        return diagnosis;
    }

    void updateDiagnosis(String newDiagnosis) {
        this.diagnosis = newDiagnosis;
    }
}














