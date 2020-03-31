package BookingModule;

import java.util.ArrayList;

public class Operator {
    String name;
    String ssn;
    String address;
    String email;
    ArrayList<String> cc;

    public Operator(String NAME, String SSN, String ADDRESS, String EMAIL, ArrayList<String> CC) {
        this.name = NAME;
        this.ssn = SSN;
        this.address = ADDRESS;
        this.email = EMAIL;
        this.cc = CC;
    }
}