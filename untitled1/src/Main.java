import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Sport soccer = new Sport("Soccer", 11, "Team");
        Sport tennis = new Sport("Tennis", 1, "Individual");
        Sport basketball = new Sport("Basketball", 5, "Team");

        System.out.println("Sports:");
        System.out.println(soccer);
        System.out.println(tennis);
        System.out.println(basketball);

        Athlete athlete1 = new Athlete("John Doe", 25, soccer.getName());
        Athlete athlete2 = new Athlete("Jane Smith", 22, tennis.getName());
        Athlete athlete3 = new Athlete("Mike Johnson", 28, basketball.getName());
        Athlete athlete4 = new Athlete("John Doe", 25, soccer.getName()); // Duplicate of athlete1 for comparison

        System.out.println("\nAthletes:");
        System.out.println(athlete1);
        System.out.println(athlete2);
        System.out.println(athlete3);
        System.out.println(athlete4);

        System.out.println("\nComparison of Athletes:");
        System.out.println("athlete1 equals athlete4: " + athlete1.equals(athlete4));
        System.out.println("athlete1 equals athlete2: " + athlete1.equals(athlete2));

        SportClub sportClub = new SportClub("Elite Club", "New York");
        sportClub.addAthlete(athlete1);
        sportClub.addAthlete(athlete2);
        sportClub.addAthlete(athlete3);

        // Output SportClub to the console
        System.out.println("\nSportClub:");
        System.out.println(sportClub);

        // Compare sports
        System.out.println("\nComparison of Sports:");
        System.out.println("soccer equals basketball: " + soccer.equals(basketball));
        System.out.println("soccer equals tennis: " + soccer.equals(tennis));
    }
}
