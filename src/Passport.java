import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private String number;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthday;

    public Passport(String number, String lastName, String firstName, String middleName, int day, int month, int year) {
        this.number = number;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthday = LocalDate.of(year, month, day);
    }
    public Passport(String number, String lastName, String firstName, int day, int month, int year) {
        this.number = number;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = LocalDate.of(year, month, day);
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
