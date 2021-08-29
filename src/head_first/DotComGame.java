package head_first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class DotCom {
    private final String name;
    private final List<String> locations;

    public DotCom(String name, List<String> locations) {
        this.name = name;
        this.locations = locations;
    }

    public boolean isLocationPresent(String location) {
        return locations.contains(location);
    }

    public boolean hit(String location) {
        locations.remove(location);

        if (locations.isEmpty()) {
            System.out.println("Kill: " + this.name);
            return true;
        }

        System.out.println("Hit: " + this.name);
        return false;
    }
}

public class DotComGame {

    static int numberOfGuesses = 0;

    public static void main(String[] args) {
        List<DotCom> dotComs = new ArrayList<>();

        setUpGame(dotComs);
        startGame(dotComs);
        finishGame();
    }

    private static void startGame(List<DotCom> dotComs) {
        Scanner scanner = new Scanner(System.in);
        while (!dotComs.isEmpty()) {
            System.out.println("Enter location");
            String location = scanner.nextLine();
            boolean isHit = false;
            numberOfGuesses++;
            for (DotCom dotCom : dotComs) {
                if (dotCom.isLocationPresent(location)) {
                    isHit = true;
                    boolean isLast = dotCom.hit(location);
                    if (isLast)
                        dotComs.remove(dotCom);
                    break;
                }

            }
            if (!isHit)
                System.out.println("Miss");
        }
    }

    private static void setUpGame(List<DotCom> dotComs) {
        DotCom dotCom1 = new DotCom("Pets.com", getLocations("0,2", "0,3", "1,3"));
        DotCom dotCom2 = new DotCom("eToys.com", getLocations("1,1", "1,2", "2,2", "2,3"));
        DotCom dotCom3 = new DotCom("Go2.com", getLocations("2,0", "3,0", "3,1"));
        dotComs.add(dotCom1);
        dotComs.add(dotCom2);
        dotComs.add(dotCom3);
    }


    private static void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numberOfGuesses <= 18) {
            System.out.println("It only took you " + numberOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numberOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    private static List<String> getLocations(String... locations) {
        return Arrays.stream(locations).collect(Collectors.toList());
    }

}
