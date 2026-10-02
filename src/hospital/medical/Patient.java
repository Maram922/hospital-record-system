package hospital.medical;

public class Patient {
    private String patientName;
    private String patientId;
    private String appointmentDate;
    private String diagnosis;

    public Patient(String patientName, String appointmentDate, String diagnosis) {
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.diagnosis = diagnosis;
    }

    public String getPatientName() {
        return patientName;
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














