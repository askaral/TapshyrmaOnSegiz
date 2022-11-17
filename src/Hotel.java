public class Hotel extends Person {

    private int hotelRoom;
    private String name;

    public Hotel(int person, String street, int monthService, int hotelRoom, String name) {
        super(person, street, monthService);
        this.hotelRoom = hotelRoom;
        this.name = name;
    }

    public int getHotelRoom() {
        return hotelRoom;
    }

    public String getName() {
        return name;
    }

    @Override
    void numberOfPerson() {
        System.out.println(getPerson()+" people live in this hotel room");
    }

    @Override
    public void paymentInfo() {
        System.out.println("They pay for a day in a hotel "+getMonthService()+" som");

    }

    @Override
    public String toString() {
        return "The address of the hotel \nHotel: "+getName()+
                "\nStreet: " + getStreet()+
                "\nRoom: " +getHotelRoom();
    }
}
