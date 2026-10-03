package hospital.admin;

public class FinancialRecord {
    private String patientName;
    private double amountBilled;

    private double taxRate = 5.0;

    FinancialRecord(String patientName, double amountBilled) {
        this.patientName = patientName;
        this.amountBilled = amountBilled;
    }

    String getPatientName() {
        return patientName;
    }

    double getAmountBilled() {
        return amountBilled;
    }

    String getSummary() {
        return "Patient: " + patientName + " | Amount billed: " + amountBilled;
    }

}
