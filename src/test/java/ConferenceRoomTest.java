import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("A", 2);
        conferenceRoom2 = new ConferenceRoom("B", 2);
        guest1 = new Guest("Melinda");
    }

    @Test
    public void conferenceRoomIsEmpty(){
        assertEquals(0, conferenceRoom1.guestCount());
    }

    @Test
    public void canAddToConferenceRoom(){
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.guestCount());
    }

    @Test
    public void canRemoveFromConferenceRoom(){
        conferenceRoom1.addGuest(guest1);
        assertEquals(true, conferenceRoom1.removeGuest(guest1));
        assertEquals(0, conferenceRoom1.guestCount());
    }

}
