package javaOCA;

interface HouseInterface {
    House getHouse(String color, int rooms);
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        HouseInterface houseInterface = House::new;
        House house = houseInterface.getHouse("pink", 12);


    }
}

class House {
    int rooms;
    String color;

    public House(String color, int rooms) {
        this.color = color;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return (this.color + " " + this.rooms);
    }
}