package javaOCA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

class Player {
    int playerNo;
    String name;
    String team;
    long salary;
    int ranking;

    public Player(int playerNo, String name, String team, long salary, int ranking) {
        this.playerNo = playerNo;
        this.name = name;
        this.team = team;
        this.salary = salary;
        this.ranking = ranking;
    }

    public int getPlayerNo() {
        return playerNo;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public long getSalary() {
        return salary;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return (this.getRanking() + " " + this.getPlayerNo() + " " + this.getName() + " "
                + this.getTeam() + " " + getSalary());
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player(23, "Amit", "boAt", 123, 3));
        players.add(new Player(45, "Shahid", "JBL", 632, 4));
        players.add(new Player(66, "Kangana", "beats", 921, 6));
        players.add(new Player(43, "Virendra", "Skull Candy", 123, 1));
        players.add(new Player(65, "Arijit", "Philips", 343, 5));
        players.add(new Player(87, "Nikhil", "Bose", 183, 2));
        players.add(new Player(90, "Farhan", "boat", 123, 7));

        for (Player player : players) {
            System.out.println(player.toString());
        }

        Comparator<Player> byTeam = Comparator.comparing(Player::getTeam);

        Comparator<Player> byName = Comparator.comparing(Player::getName);

        Comparator<Player> byRanking = Comparator.comparing(Player::getRanking); // method reference

        Comparator<Player> bySalary = (c1,c2) -> 
            Long.compare(c1.getSalary(), c2.getSalary());

        Collections.sort(players, byTeam);

        System.out.println("By Team: ");

        for (Player player : players) {
            System.out.println(player.toString());
        }

        Collections.sort(players, byName);

        System.out.println("By Name: ");

        for (Player player : players) {
            System.out.println(player.toString());
        }

        Collections.sort(players, byRanking);

        System.out.println("By Ranking: ");

        for (Player player : players) {
            System.out.println(player.toString());
        }

        Comparator<Player> byPlayerNumber = (p1, p2) ->
                Integer.compare(p1.getPlayerNo(), p2.getPlayerNo()); // byFunction<T,U,R>
    }
}

interface EmployeeInterface {
    Employee getEmployee(Employee employee);
}
