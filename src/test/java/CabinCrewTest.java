import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before() {
        cabinCrew = new CabinCrew("Jane Doe", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Jane Doe", cabinCrew.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew.getRank());
    }

}
