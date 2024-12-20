import java.util.Objects;

public class Athlete {
    private String name;
    private int age;
    private String sport;

    public Athlete(String name, int age, String sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Athlete{name='" + name + "', age=" + age + ", sport='" + sport + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return age == athlete.age &&
                Objects.equals(name, athlete.name) &&
                Objects.equals(sport, athlete.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sport);
    }


}

