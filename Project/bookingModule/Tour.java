package BookingModule;

import BookingModule.Operator;
import java.util.ArrayList;
import java.util.Date;

public class Tour {
    private Operator operator;
    private String tourName;
    private String tourId;
    private Date date;
    private int duration;
    private String region;
    private ArrayList<String> activities;
    private ArrayList<String> attractions;
    private String city;
    private int availability;
    private Boolean hotelPickup;
    private ArrayList<String> itinerary;
    private ArrayList<String> equipment;
    private int difficulty;
    private int minAge;
    private ArrayList<String> languages;
    private ArrayList<String> included;
    private ArrayList<String> excluded;
    private String otherInfo;
    private Double price;

    public Tour(Operator OPERATOR, String TOURNAME, String TOURID, Date DATE, int DURATION, String REGION,
            ArrayList<String> ACTIVITIES, ArrayList<String> ATTRACTIONS, String CITY, int AVAILABILITY,
            Boolean HOTELPICKUP, ArrayList<String> ITINERARY, ArrayList<String> EQUIPMENT, int DIFFICULTY, int MINAGE,
            ArrayList<String> LANGUAGES, ArrayList<String> INCLUDED, ArrayList<String> EXCLUDED, String OTHERINFO,
            Double PRICE) {
        this.operator = OPERATOR;
        this.tourName = TOURNAME;
        this.tourId = TOURID;
        this.date = DATE;
        this.duration = DURATION;
        this.region = REGION;
        this.activities = ACTIVITIES;
        this.attractions = ATTRACTIONS;
        this.city = CITY;
        this.availability = AVAILABILITY;
        this.hotelPickup = HOTELPICKUP;
        this.itinerary = ITINERARY;
        this.equipment = EQUIPMENT;
        this.difficulty = DIFFICULTY;
        this.minAge = MINAGE;
        this.languages = LANGUAGES;
        this.included = INCLUDED;
        this.excluded = EXCLUDED;
        this.otherInfo = OTHERINFO;
        this.price = PRICE;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public String getTourName() {
        return this.tourName;
    }

    public String getTourId() {
        return this.tourId;
    }

    public Date getDate() {
        return this.date;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getRegion() {
        return this.region;
    }

    public ArrayList<String> getActivities() {
        return this.activities;
    }

    public ArrayList<String> getAttractions() {
        return this.attractions;
    }

    public String getCity() {
        return this.city;
    }

    public int getAvailability() {
        return this.availability;
    }

    public Boolean getHotelPickup() {
        return this.hotelPickup;
    }

    public ArrayList<String> getItinerary() {
        return this.itinerary;
    }

    public ArrayList<String> getEquipment() {
        return this.equipment;
    }

    public int getDifficulty() {
        return this.difficulty;
    }

    public int getMinAge() {
        return this.minAge;
    }

    public ArrayList<String> getLanguages() {
        return this.languages;
    }

    public ArrayList<String> getIncluded() {
        return this.included;
    }

    public ArrayList<String> getExcluded() {
        return this.excluded;
    }

    public String getOtherInfo() {
        return this.otherInfo;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setAvailability(int pax) {
        this.availability -= pax;
    }
}