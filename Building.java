import java.util.ArrayList;
import java.util.Hashtable;

public class Building {
    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    private int nFloors = 1;

    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    public Building(ArrayList<String> residents, boolean hasDiningRoom) {
    }

    public Building(Hashtable<String, Boolean> collection) {
    }

    public Building(int nCoffeeOunces, int nSugarPackets, int nCreams, int ncups) {
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getFloors() {
        return this.nFloors;
    }

    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}