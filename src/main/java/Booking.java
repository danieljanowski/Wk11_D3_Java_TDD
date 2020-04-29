public class Booking {

    private int nightsBooked;
    private Bedroom bedroom;

    public Booking(int nightsBooked, Bedroom bedroom){
        this.nightsBooked = nightsBooked;
        this.bedroom = bedroom;
    }

    public int totalBill() {
        return (this.nightsBooked * this.bedroom.getRate());
    }
}
