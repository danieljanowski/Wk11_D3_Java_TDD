import java.util.ArrayList;

public class Hotel {

    public ArrayList<Bedroom> bedrooms;
    public ArrayList<ConferenceRoom> conferenceRooms;
    public ArrayList<Booking> bookings;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking>();
    }

    public int roomCount() {
        return (this.bedrooms.size() + this.conferenceRooms.size());
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkGuestIntoBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkGuestIntoConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public Booking bookRoom(int nights, Bedroom bedroom) {
        Booking booking = new Booking(nights, bedroom);
        bookings.add(booking);
        return booking;
    }


    public int countBookings() {
       return this.bookings.size();
    }
}
