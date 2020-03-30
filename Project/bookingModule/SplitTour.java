package bookingModule;

public class Tour {
    Operator operator;
    String tourName;
    Date date;
    String startTime;
    Time duration;
    String region;
    String[] activities;
    String[] attractions;
    String city;
    int availability;
}

public class TourDetails {
    String tourId; // Samansafn af operator og tourName = amazingtours.northernlights
    Boolean hotelPickup;
    String[] itinerary;
    String[] equipment;
    int difficulty;
    int minAge;
    String[] languages;
    String[] included;
    String[] excluded;
    String otherInfo;
    Double price;
}
