import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private ConferenceRoom conferenceRoom1;
    private Guest guest1;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 2, "double", 20);
        conferenceRoom1 = new ConferenceRoom("A", 10);
        guest1 = new Guest("Billy");
    }

    @Test
    public void hotelIsEmpty() {
        assertEquals(0, hotel.roomCount());
    }

    @Test
    public void canAddRoomsToHotel() {
        hotel.addBedroom(bedroom1);
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(2, hotel.roomCount());
    }

    @Test
    public void canCheckInGuestToBedroom() {
        hotel.checkGuestIntoBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canCheckInGuestToConferenceRoom() {
        hotel.checkGuestIntoConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.guestCount());
    }

    @Test
    public void canBookRoom(){
        hotel.bookRoom(2, bedroom1);
        assertEquals(1, hotel.countBookings());
    }

}
