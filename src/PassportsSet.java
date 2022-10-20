import java.util.HashSet;
import java.util.Set;

public class PassportsSet {
    private Set<Passport> passports = new HashSet<>();

    public Set<Passport> getPassports() {
        return passports;
    }

    public void addPassport(Passport passport) {
        passports.remove(passport);
        passports.add(passport);
    }

    public Passport searchPassport(String number) {
        for (Passport passport : passports) {
            if (passport.getNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    public void printAllPassports() {
        for (Passport passport : passports) {
            System.out.println(passport);
        }
    }
}
