import org.junit.Before;
import org.junit.Test;
import people.Pilot;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Nicolas Cage", Rank.CAPTAIN, "CONAIR123");
    }

    @Test
    public void pilotHasName() {
        assertEquals("Nicolas Cage", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicence() {
        assertEquals("CONAIR123", pilot.getLicenceNumber());
    }

}
