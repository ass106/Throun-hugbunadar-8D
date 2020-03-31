package project.test.controller;

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

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testSearch() {
        ArrayList<Tour> tours;
        tours = DatabaseConnection.searchName("Northern Lights");
        assertEquals(1, tours.size(),
                "tours list should be of size 1 since we only have one Northern Lights tour in our DB");
    }

    @Test
    public void testSearchFail() {
        ArrayList<Tour> tours;
        tours = DatabaseConnection.searchName("Samloka");
        assertEquals(0, tours.size(), "tours list should be of size 0 since there is no Samloka tour in our DB");
    }

    @Test
    public void testSearchDate() throws ParseException {
        ArrayList<Tour> tours;
        tours = DatabaseConnection.searchDates("2020-03-31");
        assertEquals(1, tours.size(), "tours list should be of size 1 since we only have one tour on 31st in our DB");
    }

    @Test
    public void testSearchByCity() {
        ArrayList<Tour> tours;
        tours = DatabaseConnection.searchByCity("Reykjavík");
        assertEquals(2, tours.size(), "tours list should be of size 2 since we have 2 tours from Reykjavík in our DB");
    }

}
