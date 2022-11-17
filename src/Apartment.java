public class Apartment extends Person {

    private int homeNumber;

    public Apartment(int person, String street, int monthService, int homeNumber) {
        super(person, street, monthService);
        this.homeNumber = homeNumber;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    @Override
    void numberOfPerson() {
        System.out.println(getPerson()+" people live in this apartment");
    }

    @Override
    public void paymentInfo() {
        System.out.println("Monthly utility service "+getMonthService()+" som");

    }

    @Override
    public String toString() {
        return "The address of the apartment \nStreet: " +getStreet()+
                "\nHouse number: " + homeNumber;
    }
}
