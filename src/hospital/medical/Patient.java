package hospital.medical;

public class Patient {
    private String patientName;
    private String appointmentDate;
    private String diagnosis;

    private String roomNumber = "Room 101";

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

    public String getRoomNumber() {
        return roomNumber;
    }

    String getDiagnosis() {
        return diagnosis;
    }

    void updateDiagnosis(String newDiagnosis) {
        this.diagnosis = newDiagnosis;
    }
}














