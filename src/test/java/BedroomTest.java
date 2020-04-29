import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;
    private Booking booking1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 2, "double", 20);
        bedroom2 = new Bedroom(2, 2, "double", 20);
        guest1 = new Guest("Keith");
        booking1 = new Booking (2, bedroom1);
    }

    @Test
    public void bedroomIsEmpty(){
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canAddToBedroom(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canRemoveFromBedroom(){
        bedroom1.addGuest(guest1);
        assertEquals(true, bedroom1.removeGuest(guest1));
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canGetTotalBill(){
        assertEquals(40, booking1.totalBill());
    }

}
