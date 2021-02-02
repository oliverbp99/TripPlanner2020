public class SkiTrip extends Trip {
    private String liftCard;
    private int skis;

    public SkiTrip(String country, int persons, int days, int price, String liftCard, int skis) {
        super(country, persons, days, price);
        this.liftCard = liftCard;
        this.skis = skis;
    }

    @Override
    public String toString() {
        return "SkiTrip{" +
                "liftCard='" + liftCard + '\'' +
                ", skis=" + skis +
                ", country='" + country + '\'' +
                ", persons=" + persons +
                ", days=" + days +
                ", price=" + price +
                '}';
    }

    public String getLiftCard() {
        return liftCard;
    }

    public void setLiftCard(String liftCard) {
        this.liftCard = liftCard;
    }

    public int getSkis() {
        return skis;
    }

    public void setSkis(int skis) {
        this.skis = skis;
    }
}
