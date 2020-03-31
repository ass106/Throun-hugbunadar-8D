package Controller;

import Model.Trip;
import org.junit.*;
import java.text.ParseException;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class DatabaseControllerTest {
    @Test
    public void testSearch() {
        ArrayList<Trip> trips = db.searchName("horse");
        assertEquals(2, trips.size());
    }

    @Test
    public void testSearchFail() {
        ArrayList<Trip> trips = db.searchName("sugalumps");
        assertEquals(0, trips.size());
    }

    @Test
    public void testSearchDate() throws ParseException {
        ArrayList<Trip> trips = db.searchDates("2019-05-21");
        assertEquals(1, trips.size());
    }

    @Test
    public void testSearchLocations() {
        ArrayList<Trip> trips = db.searchLocations("Reykjavík");
        assertEquals(1, trips.size());
    }
}