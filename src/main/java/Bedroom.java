import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private int rate;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String type, int rate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.rate = rate;
        this.guests = new ArrayList<Guest>();
    }

    public int getRate() {
        return rate;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public boolean removeGuest(Guest guest) {
        return this.guests.remove(guest);
    }

}
