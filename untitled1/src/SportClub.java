import java.util.ArrayList;
import java.util.List;

public class SportClub {
    private String name;
    private String location;
    private List<Athlete> athletes;

    public SportClub(String name, String location) {
        this.name = name;
        this.location = location;
        this.athletes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void addAthlete(Athlete athlete) {
        this.athletes.add(athlete);
    }

    public void removeAthlete(Athlete athlete) {
        this.athletes.remove(athlete);
    }

    @Override
    public String toString() {
        return "SportClub{name='" + name + "', location='" + location + "', athletes=" + athletes + "}";
    }
}
