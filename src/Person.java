public abstract class Person implements Service {

     private int person;
     private String street;
     private int monthService;

    public Person(int person, String street, int monthService) {
        this.person = person;
        this.street = street;
        this.monthService = monthService;
    }

    public int getPerson() {
        return person;
    }

    public String getStreet() {
        return street;
    }

    public int getMonthService() {
        return monthService;
    }

    abstract void numberOfPerson();

}

