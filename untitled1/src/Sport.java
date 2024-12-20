import java.util.Objects;

public class Sport {
    private String name;
    private int numberOfPlayers;
    private String type;

    public Sport(String name, int numberOfPlayers, String type) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sport{name='" + name + "', numberOfPlayers=" + numberOfPlayers + ", type='" + type + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sport sport = (Sport) o;
        return numberOfPlayers == sport.numberOfPlayers &&
                Objects.equals(name, sport.name) &&
                Objects.equals(type, sport.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfPlayers, type);
    }

}
