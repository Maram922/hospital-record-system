package hospital.staff;

public class Staff {
    protected String name;
    protected String staffId;

    public Staff(String name, String staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }
}
