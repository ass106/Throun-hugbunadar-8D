package Controller;

import java.io.Console;
import java.sql.*;

import BookingModule.Tour;
import BookingModule.Operator;
import org.junit.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class DatabaseTest {
    private Connection db;

    @Before
    public void setUp() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        String url = "jdbc:postgresql://balarama.db.elephantsql.com:5432/gfuwxdnl";
        String username = "gfuwxdnl";
        String password = "aJEImx-neFDHBx8x64XCSXoflhaAbsIO";

        try {
            db = DriverManager.getConnection(url, username, password);

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @After
    public void tearDown() {
        db = null;
    }

    @Test
    public void testSearch() {
        ArrayList<Tour> tours;

        assertEquals(1, tours.size(),
                "tours list should be of size 1 since we only have one Northern Lights tour in our DB");
    }

    @Test
    public void testSearchFail() {
        ArrayList<Tour> tours;

        try {

            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tour WHERE tourname = 'Samloka'");
            while (rs.next()) {
                Operator operator = new Operator(rs.getString(1), " ", " ", " ", new ArrayList<String>());

                tourName = rs.getString(2);
                System.out.println(tourName);
                String tourId = rs.getString(3);
                Date date = Date.valueOf(rs.getString(4));
                int duration = rs.getInt(5);
                String region = rs.getString(6);
                ArrayList<String> activities = Arrays.asList(rs.getArray(7));
                ArrayList<String> attractions = Arrays.asList(rs.getArray(8));
                String city = rs.getString(9);
                int availability = rs.getInt(10);
                Boolean hotelPickup = rs.getBoolean(11);
                ArrayList<String> itinerary = Arrays.asList(rs.getArray(12));
                ArrayList<String> equipment = Arrays.asList(rs.getArray(13));
                int difficulty = rs.getInt(14);
                int minAge = rs.getInt(15);
                ArrayList<String> languages = Arrays.asList(rs.getArray(16));
                ArrayList<String> included = Arrays.asList(rs.getArray(17));
                ArrayList<String> excluded = Arrays.asList(rs.getArray(18));
                String otherInfo = rs.getString(19);
                Double price = rs.getDouble(20);

                Tour newTour = new Tour(operator, tourName, tourId, date, duration, region, activities, attractions,
                        city, availability, hotelPickup, itinerary, equipment, difficulty, minAge, languages, included,
                        excluded, otherInfo, price);

                tours.add(newTour);
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
        assertEquals(0, tours.size(), "tours list should be of size 0 since there is no Samloka tour in our DB");
    }

    @Test
    public void testSearchDate() throws ParseException {
        ArrayList<Tour> tours;
        connectToDatabase();

        try {

            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tour WHERE date = '2020-03-31'");
            while (rs.next()) {
                Operator operator = new Operator(rs.getString(0), " ", " ", " ", new ArrayList<String>());

                tourName = rs.getString(1);
                System.out.println(tourName);
                String tourId = rs.getString(2);
                Date date = Date.valueOf(rs.getString(3));
                int duration = rs.getInt(4);
                String region = rs.getString(5);
                ArrayList<String> activities = Arrays.asList(rs.getArray(6));
                ArrayList<String> attractions = Arrays.asList(rs.getArray(7));
                String city = rs.getString(8);
                int availability = rs.getInt(9);
                Boolean hotelPickup = rs.getBoolean(10);
                ArrayList<String> itinerary = Arrays.asList(rs.getArray(11));
                ArrayList<String> equipment = Arrays.asList(rs.getArray(12));
                int difficulty = rs.getInt(13);
                int minAge = rs.getInt(14);
                ArrayList<String> languages = Arrays.asList(rs.getArray(15));
                ArrayList<String> included = Arrays.asList(rs.getArray(16));
                ArrayList<String> excluded = Arrays.asList(rs.getArray(17));
                String otherInfo = rs.getString(18);
                Double price = rs.getDouble(19);

                Tour newTour = new Tour(operator, tourName, tourId, date, duration, region, activities, attractions,
                        city, availability, hotelPickup, itinerary, equipment, difficulty, minAge, languages, included,
                        excluded, otherInfo, price);

                tours.add(newTour);
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
        assertEquals(1, tours.size(), "tours list should be of size 1 since we only have one tour on 31st in our DB");
    }

    @Test
    public void testSearchLocations() {
        ArrayList<Tour> tours;
        connectToDatabase();

        try {

            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tour WHERE city = 'Reykjavík'");
            while (rs.next()) {
                Operator operator = new Operator(rs.getString(0), " ", " ", " ", new ArrayList<String>());

                tourName = rs.getString(1);
                System.out.println(tourName);
                String tourId = rs.getString(2);
                Date date = Date.valueOf(rs.getString(3));
                int duration = rs.getInt(4);
                String region = rs.getString(5);
                ArrayList<String> activities = Arrays.asList(rs.getArray(6));
                ArrayList<String> attractions = Arrays.asList(rs.getArray(7));
                String city = rs.getString(8);
                int availability = rs.getInt(9);
                Boolean hotelPickup = rs.getBoolean(10);
                ArrayList<String> itinerary = Arrays.asList(rs.getArray(11));
                ArrayList<String> equipment = Arrays.asList(rs.getArray(12));
                int difficulty = rs.getInt(13);
                int minAge = rs.getInt(14);
                ArrayList<String> languages = Arrays.asList(rs.getArray(15));
                ArrayList<String> included = Arrays.asList(rs.getArray(16));
                ArrayList<String> excluded = Arrays.asList(rs.getArray(17));
                String otherInfo = rs.getString(18);
                Double price = rs.getDouble(19);

                Tour newTour = new Tour(operator, tourName, tourId, date, duration, region, activities, attractions,
                        city, availability, hotelPickup, itinerary, equipment, difficulty, minAge, languages, included,
                        excluded, otherInfo, price);

                tours.add(newTour);
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
        assertEquals(2, tours.size(), "tours list should be of size 2 since we have 2 tours from Reykjavík in our DB");
    }

}
