import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Primer> primers = new HashSet<>();
        Random rand = new Random();

        while (primers.size() < 15) {
            int x = 2 + rand.nextInt(8);
            int y = 2 + rand.nextInt(8);
            primers.add(new Primer(x, y));
        }

        for (Primer current : primers) {
            System.out.println(current);
        }
//////////////////////////////
        System.out.println();
        Passport passport1 = new Passport("012345", "Жуков", "Алексей",
                22, 12, 2000);
        Passport passport2 = new Passport("012345", "Иванов", "Иван",
                "Иванович", 2, 1, 1990);
        Passport passport3 = new Passport("234567", "Петров", "Петр",
                "Петрович", 23, 6, 1980);


        PassportsList passportsList1 = new PassportsList();
        passportsList1.addPassport(passport1);
        passportsList1.addPassport(passport3);
        passportsList1.printAllPassports();
        System.out.println();
        passportsList1.addPassport(passport2);
        passportsList1.printAllPassports();




    }
}