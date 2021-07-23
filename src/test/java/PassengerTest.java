import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Jane Doe", 2);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Jane Doe", passenger.getName());
    }

    @Test
    public void passengerHasBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }
    
}
