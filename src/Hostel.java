public class Hostel extends Person {

    private int room;

    public Hostel(int person, String street, int monthService, int room) {
        super(person, street, monthService);
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    @Override
    void numberOfPerson() {
        System.out.println(getPerson()+" people live in this hostel room");

    }

    @Override
    public void paymentInfo() {
        System.out.println("They pay for a month in a hostel "+getMonthService()+" som");

    }

    @Override
    public String toString() {
        return "The address of the hostel \nStreet: "+getStreet()+
                "\nRoom: " + room;
    }
}
