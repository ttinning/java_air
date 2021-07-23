import org.junit.Before;
import org.junit.Test;
import people.*;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight;
    private Passenger passenger;

    private FlightManager flightManager;

    @Before
    public void before() {
        flight = new Flight("BA3454", PlaneType.AIRBUSA320, "LCY", "EDI", "08.55");
        passenger = new Passenger("Jane Doe", 2);
        flightManager = new FlightManager();
    }

    @Test
    public void totalBagsOnPlaneStartsAtZero() {
        assertEquals(0, flight.getTotalBags());
    }

    @Test
    public void canAddLuggage() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(4, flight.getTotalBags());
    }

    @Test
    public void canGetBaggageAllowanceForFlight() {
        assertEquals(61166, flightManager.getTotalBaggageAllowance(flight));
    }

    @Test
    public void canGetPassengerAllowance() {
        assertEquals(493, flightManager.getPassengerAllowance(flight));
    }

    @Test
    public void getTotalBaggageBookedForFlight() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(986, flightManager.getTotalBaggageBookedWeight(flight));
    }

    @Test
    public void getRemainingBaggageAllowance() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(60180, flightManager.remainingBaggageAllowance(flight));
    }

}
