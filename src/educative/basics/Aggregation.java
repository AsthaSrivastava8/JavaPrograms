package educative.basics;

class Country {

    private String name;
    private int population;

    public Country(String n, int p) {
        name = n;
        population = p;
    }

    public String getName() {
        return name;
    }
    public int getPopulation() {return population;}

}

class Person {

    private String name;
    private Country country; // An instance of Country class

    public Person(String n, Country c) {
        name = n;
        country = c;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country.getName());
    }
}

public class Aggregation {

    public static void main(String[] args) {
        Country country = new Country("Utopia", 1);
        {
            Person user = new Person("Darth Vader", country);
            user.printDetails();
        }
        System.out.println(country.getName());// The country object still exists!
        System.out.println(country.getPopulation());
    }
}

