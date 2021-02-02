public class BeachTrip extends Trip {
    private String towel;
    private String ball;

    public BeachTrip(String country, int persons, int days, int price, String towel, String ball) {
        super(country, persons, days, price);
        this.towel = towel;
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "BeachTrip{" +
                "towel='" + towel + '\'' +
                ", ball='" + ball + '\'' +
                ", country='" + country + '\'' +
                ", persons=" + persons +
                ", days=" + days +
                ", price=" + price +
                '}';
    }

    public String getTowel() {
        return towel;
    }

    public void setTowel(String towel) {
        this.towel = towel;
    }

    public String getBall() {
        return ball;
    }

    public void setBall(String ball) {
        this.ball = ball;
    }
}
