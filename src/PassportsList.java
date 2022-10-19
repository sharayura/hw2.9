import java.util.ArrayList;
import java.util.List;

public class PassportsList {
    private List<Passport> passports = new ArrayList<>();

    public List<Passport> getPassports() {
        return passports;
    }

    public void addPassport(Passport passport) {
        for (int i = 0; i < passports.size(); i++) {
            if (passports.get(i).equals(passport)) {
                passports.set(i, passport);
                return;
            }
        }
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
