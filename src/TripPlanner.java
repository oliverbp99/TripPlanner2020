import java.util.ArrayList;
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BeachTrip> beachList = new ArrayList<>();
        ArrayList<SkiTrip> skiList = new ArrayList<>();

        menu(input, beachList, skiList);

        showList(beachList, skiList);
    }

    private static void showList(ArrayList<BeachTrip> a1, ArrayList<SkiTrip> a2) {
        System.out.println(a1);
        System.out.println(a2);
    }

    public static void menu(Scanner input, ArrayList<BeachTrip> beachList, ArrayList<SkiTrip> skiList){
        System.out.println("Welcome to Trip planner");
        System.out.println("Chose trip\n1. Ski Trip\n2. Beach Trip");
        int ans = input.nextInt();
        if (ans == 1){
            createSkiTrip(input, skiList);
        }else if (ans == 2){
            createBeachTrip(input, beachList);
        }
    }

    private static void createBeachTrip(Scanner input, ArrayList<BeachTrip> a1) {
        System.out.println("Type in the country");
        String country = input.next();
        System.out.println("duration");
        int duration = input.nextInt();
        System.out.println("persons");
        int persons = input.nextInt();
        System.out.println("price");
        int price = input.nextInt();
        System.out.println("What type of towel");
        String towel = input.next();
        System.out.println("Type of ball");
        String ball = input.next();
        BeachTrip t1 = new BeachTrip(country, duration, persons, price, towel, ball);
        a1.add(t1);
    }

    private static void createSkiTrip(Scanner input, ArrayList<SkiTrip> a1) {
        System.out.println("Type in the country");
        String country = input.next();
        System.out.println("duration");
        int duration = input.nextInt();
        System.out.println("persons");
        int persons = input.nextInt();
        System.out.println("price");
        int price = input.nextInt();
        System.out.println("lift card");
        String liftCard = input.next();
        System.out.println("skis");
        int skis = input.nextInt();
        SkiTrip t1 = new SkiTrip(country, duration, persons, price, liftCard, skis);
        a1.add(t1);
    }
}
