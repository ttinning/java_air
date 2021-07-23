import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;
import people.Passenger;
import people.Pilot;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger;
    private CabinCrew cabinCrew;
    private Pilot pilot;

    @Before
    public void before() {
        flight = new Flight("BA3454", PlaneType.AIRBUSA320, "LCY", "EDI", "08.55");
        passenger = new Passenger("Jane Doe", 2);
        cabinCrew = new CabinCrew("John Doe", Rank.FLIGHT_ATTENDANT);
        pilot = new Pilot("Johnny Doe", Rank.CAPTAIN, "123456");
    }

    @Test
    public void flightHasFlightNumber() {
        assertEquals("BA3454", flight.getFlightNumber());
    }

    @Test
    public void flightHasPlaneType() {
        assertEquals(PlaneType.AIRBUSA320, flight.getPlaneType());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("LCY", flight.getDestination());
    }

    @Test
    public void flightHasDepartureLocation() {
        assertEquals("EDI", flight.getDepartureLocation());
    }

    @Test
    public void flightHasTimeOfDeparture() {
        assertEquals("08.55", flight.getDepartureTime());
    }

    @Test
    public void flightHasAPilot() {
        flight.addPilot(pilot);
        assertEquals(1, flight.getPilots().size());
    }

    @Test
    public void flightHasCrew() {
        flight.addCabinCrew(cabinCrew);
        assertEquals(1, flight.getCabinCrew().size());
    }

    @Test
    public void flightHasPassengers() {
        flight.bookPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void testAvailableSeats() {
        assertEquals(flight.getPlaneType().getSeatCapacity(), flight.returnEmptySeats());
    }

    @Test
    public void canBookPassengers() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(121, flight.returnEmptySeats());
    }

    @Test
    public void canGetPlanesWeight() {
        assertEquals(183500, flight.getPlaneWeight());
    }
}
