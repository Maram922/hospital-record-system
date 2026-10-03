package hospital.admin;

public class Administration {
    private FinancialRecord record;

    private String operatingHours = "Monday - Friday: 8:00 AM - 5:00 PM";

    public Administration(String patientName, double amountBilled) {
        this.record = new FinancialRecord(patientName, amountBilled);
    }

    public String viewFinancialSummary() {
        return record.getSummary();
    }
}
