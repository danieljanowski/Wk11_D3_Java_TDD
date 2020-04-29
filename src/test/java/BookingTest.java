import org.junit.Before;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "double", 20);
        booking = new Booking(2, bedroom);
    }

}
