public class Trip {
    String country;
    int persons;
    int days;
    int price;

    public Trip(String country, int persons, int days, int price) {
        this.country = country;
        this.persons = persons;
        this.days = days;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "country='" + country + '\'' +
                ", persons=" + persons +
                ", days=" + days +
                ", price=" + price +
                '}';
    }
}
