package Controller;

import Model.Trip;
import java.text.ParseException;
import java.util.ArrayList;

public class DBMock {
    private ArrayList<Trip> trips = new ArrayList();

    public DatabaseMock() {
        ArrayList<String> dates1 = new ArrayList();
        dates1.add("2019-04-21");
        dates1.add("2019-04-12");
        dates1.add("2019-04-29");
        ArrayList<String> dates2 = new ArrayList();
        dates2.add("2019-05-21");
        dates2.add("2019-04-12");
        dates2.add("2019-04-29");
        ArrayList<String> dates3 = new ArrayList();
        dates3.add("2019-04-21");
        dates3.add("2019-05-12");
        dates3.add("2019-04-29");
        ArrayList<String> interests1 = new ArrayList();
        interests1.add("Agriculture");
        interests1.add("Horses");
        ArrayList<String> interests2 = new ArrayList();
        interests2.add("Horses");
        interests2.add("Museums");
        interests2.add("Dancing");
        ArrayList<String> interests3 = new ArrayList();
        interests3.add("Dancing");
        interests3.add("Nature");
        System.out.println("HAlló");
        trips.add(new Trip("Horses and stuff", interests1, "Go horsebackriding, look at horses and see the nature", 5,
                "Go horsebackriding and stuff", 8, 1, "Egill", dates1, "Egilsstaðir", 5000));
        trips.add(new Trip("Dancing & horses", interests2, "Go dancing with the horses & go to the penis museum", 3,
                "Dance with the horses", 10, 2, "Emma", dates2, "Selfoss", 4000));
        trips.add(new Trip("Glacier dancing", interests3, "Go see all the glaciers & Iceland and dance on them", 9,
                "Dance on the best glaciers", 2, 3, "Flóki", dates3, "Reykjavík", 10000));
        // String name, String[] interests, String description, int duration, String
        // introduction, int seats, int id, String tourGuide, String[] date, String
        // location, int price)
    }

    public ArrayList<Trip> searchLocations(String s) {
        ArrayList<Trip> matches = new ArrayList<Trip>();
        for (int i = 0; i < trips.size(); i++) {
            if (trips.get(i).getLocation() == s) {
                matches.add(trips.get(i));
            }
        }
        return matches;
    }

    public ArrayList<Trip> searchDates(String date) throws ParseException {
        ArrayList<Trip> matches = new ArrayList<Trip>();
        for (int i = 0; i < trips.size(); i++) {
        }
        return matches;
    }

    public ArrayList<Trip> searchName(String s) {
        ArrayList<Trip> matches = new ArrayList<Trip>();
        for (int i = 0; i < trips.size(); i++) {
            String name = trips.get(i).getName();
            if (name.toLowerCase().contains(s.toLowerCase())) {
                matches.add(trips.get(i));
            }
        }
        return matches;
    }
}