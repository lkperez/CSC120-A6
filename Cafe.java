/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int ncups;

    public Cafe(int nCoffeeOunces, int nSugarPackets, int nCreams, int ncups) {
        super(nCoffeeOunces, nSugarPackets, nCreams, ncups);
        System.out.println("You have built a cafe: ☕");
    }
    
    public void sellCoffee(int ncups, int nSugarPackets, int nCreams){
        nCoffeeOunces =- nCoffeeOunces;
        nSugarPackets =- nSugarPackets;
        nCreams =- nCreams;
        ncups =- ncups;
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int ncups){
        nCoffeeOunces = 0 + nCoffeeOunces;
        nSugarPackets = 0 + nSugarPackets;
        nCreams = 0 + nCreams;
        nCups = 0 + nCups;
            
    }
    }
    public static void main(String[] args) {
        new Cafe();
    }
    
}
