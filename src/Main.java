public class Main {
    public static void main(String[] args) {

        Person [] person = {new Apartment(5,"10 mkr/dom 17",3500, 77),
                            new Hostel(4, "8 mkr/dom 34",25000,56),
                            new Hotel(3,"Abdrahmanov 191", 5000,102,"Haytt")};

        for (Person family:person) {
            System.out.println(family);
            family.numberOfPerson();
            family.paymentInfo();
            System.out.println("* * * * * * * * * * * * * *");

        }
    }
}