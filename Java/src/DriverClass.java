import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        // Scanner class object
        Scanner userScan = new Scanner(System.in);

        // prompting user for the name of a bill
        System.out.print("Enter the name of a bill : ");

        // reading the name of a bill
        String bill = userScan.nextLine();

        // prompting user for the name of a sports team
        System.out.print("Enter the name of a sports team : ");

        // reading the name of a sports team
        String team = userScan.nextLine();

        // prompting user for the name of a movie
        System.out.print("Enter the name of a movie : ");

        // reading the name of a movie
        String movie = userScan.nextLine();

        // object of SpeakerOfTheHouse class
        SpeakerOfTheHouse soh = new SpeakerOfTheHouse();

        soh.speak();// call speak() method
        soh.announce(bill);// call announce() method

        // object of SportsAnnouncer class
        SportsAnnouncer sa = new SportsAnnouncer();
        sa.speak();// call speak() method
        sa.announce(team);// call announce() method

        // object of Actor class
        Actor actor = new Actor();
        actor.speak();// call speak() method
        actor.announce(movie);// call announce() method

        // close userScan
        userScan.close();
    }
}

