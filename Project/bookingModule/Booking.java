package bookingModule;

import java.util.ArrayList;

public class Booking {
    String bookingId;
    User user;
    ArrayList<Tour> tours;
    int pax;
    Boolean paid;

    public Booking(String BOOKINGID, User USER, ArrayList<Tour> TOURS, int PAX, Boolean PAID) {
        this.bookingId = BOOKINGID;
        this.user = USER;
        this.tours = TOURS;
        this.pax = PAX;
        this.paid = PAID;
    }

    public String getBookingId() {
        return this.bookingId;
    }

    public User getUser() {
        return this.user;
    }

    public ArrayList<Tour> getTours() {
        return this.tours;
    }

    public int getPax() {
        return this.pax;
    }

    public Boolean getPaid() {
        return this.paid;
    }
}