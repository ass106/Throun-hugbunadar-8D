package project.test.controller;

import java.sql.*;

import BookingModule.Tour;
import BookingModule.Operator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Date;

public class DatabaseConnection {
    Connection db;

    public void connect() {
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

    public ArrayList<String> arrayToArrayList(Array convertMe) {
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            String[] regular = (String[]) convertMe.getArray();
            for (int i = 0; i < regular.length; i++) {
                arrayList.add(regular[i]);
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
        return arrayList;
    }

    public ArrayList<Tour> searchByCity(String s) {
        connect();
        ArrayList<Tour> matches = new ArrayList<Tour>();
        try {

            String stmt = "SELECT * FROM tour WHERE city LIKE ?";
            PreparedStatement st = db.prepareStatement(stmt);
            st.clearParameters();
            st.setString(1, s);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Operator operator = new Operator(rs.getString(1), " ", " ", " ", new ArrayList<String>());

                String tourName = rs.getString(2);
                String tourId = rs.getString(3);
                Date date = new Date(rs.getString(4));
                int duration = rs.getInt(5);
                String region = rs.getString(6);
                ArrayList<String> activities = arrayToArrayList(rs.getArray(7));
                ArrayList<String> attractions = arrayToArrayList(rs.getArray(8));
                String city = rs.getString(9);
                int availability = rs.getInt(10);
                Boolean hotelPickup = rs.getBoolean(11);
                ArrayList<String> itinerary = arrayToArrayList(rs.getArray(12));
                ArrayList<String> equipment = arrayToArrayList(rs.getArray(13));
                int difficulty = rs.getInt(14);
                int minAge = rs.getInt(15);
                ArrayList<String> languages = arrayToArrayList(rs.getArray(16));
                ArrayList<String> included = arrayToArrayList(rs.getArray(17));
                ArrayList<String> excluded = arrayToArrayList(rs.getArray(18));
                String otherInfo = rs.getString(19);
                Double price = rs.getDouble(20);

                Tour newTour = new Tour(operator, tourName, tourId, date, duration, region, activities, attractions,
                        city, availability, hotelPickup, itinerary, equipment, difficulty, minAge, languages, included,
                        excluded, otherInfo, price);

                matches.add(newTour);
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return matches;
    }

    public ArrayList<Tour> searchDates(String searchDate) throws ParseException {
        connect();
        ArrayList<Tour> matches = new ArrayList<Tour>();
        try {

            String stmt = "SELECT * FROM tour WHERE date = ?";
            PreparedStatement st = db.prepareStatement(stmt);
            st.clearParameters();
            st.setString(1, searchDate);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Operator operator = new Operator(rs.getString(1), " ", " ", " ", new ArrayList<String>());

                String tourName = rs.getString(2);
                String tourId = rs.getString(3);
                Date date = new Date(rs.getString(4));
                int duration = rs.getInt(5);
                String region = rs.getString(6);
                ArrayList<String> activities = arrayToArrayList(rs.getArray(7));
                ArrayList<String> attractions = arrayToArrayList(rs.getArray(8));
                String city = rs.getString(9);
                int availability = rs.getInt(10);
                Boolean hotelPickup = rs.getBoolean(11);
                ArrayList<String> itinerary = arrayToArrayList(rs.getArray(12));
                ArrayList<String> equipment = arrayToArrayList(rs.getArray(13));
                int difficulty = rs.getInt(14);
                int minAge = rs.getInt(15);
                ArrayList<String> languages = arrayToArrayList(rs.getArray(16));
                ArrayList<String> included = arrayToArrayList(rs.getArray(17));
                ArrayList<String> excluded = arrayToArrayList(rs.getArray(18));
                String otherInfo = rs.getString(19);
                Double price = rs.getDouble(20);

                Tour newTour = new Tour(operator, tourName, tourId, date, duration, region, activities, attractions,
                        city, availability, hotelPickup, itinerary, equipment, difficulty, minAge, languages, included,
                        excluded, otherInfo, price);

                matches.add(newTour);
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return matches;
    }

    public ArrayList<Tour> searchName(String s) {
        connect();
        ArrayList<Tour> matches = new ArrayList<Tour>();
        try {

            String stmt = "SELECT * FROM tour WHERE tourname LIKE ?";
            PreparedStatement st = db.prepareStatement(stmt);
            st.clearParameters();
            st.setString(1, s);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Operator operator = new Operator(rs.getString(1), " ", " ", " ", new ArrayList<String>());

                String tourName = rs.getString(2);
                String tourId = rs.getString(3);
                Date date = new Date(rs.getString(4));
                int duration = rs.getInt(5);
                String region = rs.getString(6);
                ArrayList<String> activities = arrayToArrayList(rs.getArray(7));
                ArrayList<String> attractions = arrayToArrayList(rs.getArray(8));
                String city = rs.getString(9);
                int availability = rs.getInt(10);
                Boolean hotelPickup = rs.getBoolean(11);
                ArrayList<String> itinerary = arrayToArrayList(rs.getArray(12));
                ArrayList<String> equipment = arrayToArrayList(rs.getArray(13));
                int difficulty = rs.getInt(14);
                int minAge = rs.getInt(15);
                ArrayList<String> languages = arrayToArrayList(rs.getArray(16));
                ArrayList<String> included = arrayToArrayList(rs.getArray(17));
                ArrayList<String> excluded = arrayToArrayList(rs.getArray(18));
                String otherInfo = rs.getString(19);
                Double price = rs.getDouble(20);

                Tour newTour = new Tour(operator, tourName, tourId, date, duration, region, activities, attractions,
                        city, availability, hotelPickup, itinerary, equipment, difficulty, minAge, languages, included,
                        excluded, otherInfo, price);

                matches.add(newTour);
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return matches;
    }
}