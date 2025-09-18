// File: Lease.java
// Author: Flor A. Guadalupe
// Date: Sep-17-2025
// Class: COMP 2400 OOP
// Description: This class models an apartment lease with tenant details, rent, and term, and includes methods to add a pet fee and explain the policy.
public class Lease {
    private String tenantName;
    private int apartmentNumber;
    private double rent;
    private int term;

    public Lease() {
        tenantName = "XXX";
        apartmentNumber = 0;
        rent = 1000;
        term = 12;
    }

    public Lease(String tenantName, int apartmentNumber, double rent, int term) {
        this.tenantName = tenantName;
        this.apartmentNumber = apartmentNumber;
        this.rent = rent;
        this.term = term;
    }

    public String getTenantName() { return tenantName; }
    public void setTenantName(String tenantName) { this.tenantName = tenantName; }

    public int getApartmentNumber() { return apartmentNumber; }
    public void setApartmentNumber(int apartmentNumber) { this.apartmentNumber = apartmentNumber; }

    public double getRent() { return rent; }
    public void setRent(double rent) { this.rent = rent; }

    public int getTerm() { return term; }
    public void setTerm(int term) { this.term = term; }

    public void addPetFee() {
        rent += 10;
        explainPetPolicy();
    }

    public static void explainPetPolicy() {
        System.out.println("A pet fee of $10 has been added to the monthly rent.");
    }
}
