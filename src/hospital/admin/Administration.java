package hospital.admin;

public class Administration {
    private FinancialRecord record;

    public Administration(String patientName, double amountBilled) {
        this.record = new FinancialRecord(patientName, amountBilled);
    }

    public String viewFinancialSummary() {
        return record.getSummary();
    }
}
