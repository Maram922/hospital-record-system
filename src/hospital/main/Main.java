package hospital.main;

import hospital.admin.Administration;
import hospital.medical.Doctor;
import hospital.medical.Patient;
import hospital.reception.Receptionist;

public class Main{
    public static void main() {
        Patient p1 = new Patient("Sarah Nakato", "2026-10-15", "Malaria");
        Doctor doctor = new Doctor("Dr. Okello", "D001");
        Receptionist receptionist = new Receptionist("Grace", "R001");
        Administration admin = new Administration("Sarah Nakato", 150000);

        System.out.println("--- Doctor ---");
        System.out.println(doctor.getDoctorDetails());
        System.out.println("Diagnosis: " + doctor.viewDiagnosis(p1));
        doctor.updateDiagnosis(p1, "Typhoid");
        System.out.println("Updated diagnosis: " + doctor.viewDiagnosis(p1));

        System.out.println("--- Receptionist ---");
        System.out.println("Staff name: " + receptionist.getName());
        System.out.println(receptionist.viewPatientDetails(p1));

        System.out.println("--- Administration ---");
        System.out.println(admin.viewFinancialSummary());
    }
}