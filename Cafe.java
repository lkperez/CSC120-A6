/* This is a stub for the Cafe class */

  public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int ncups;

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.ncups = 50;
        System.out.println("You have built a cafe: ☕");
    }

/** 
   *  updates inventory when a cup of coffee is sold
   *  @param nCoffeeOunces the amount of ounces of coffee in inventory 
   * @param nSugarPackets the amount of sugar packets in inventory
   * @param nCreams the amount of cream left in inventory 
   * @param ncups the amount of cups left in inventory
   */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces == 0 || this.nSugarPackets == 0 || this.nCreams == 0 || this.ncups == 0){
            restock(10,10,10,10);
        }
        this.nCoffeeOunces =- size;
        this.nSugarPackets =- nSugarPackets;
        this.nCreams =- nCreams;
        this.ncups =- 1;
    
    }

    /** 
   *  Restocks the inventory when needed
   *  @param nCoffeeOunces the amount of ounces of coffee in inventory 
   * @param nSugarPackets the amount of sugar packets in inventory
   * @param nCreams the amount of cream left in inventory 
   * @param ncups the amount of cups left in inventory
   */

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int ncups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.ncups += ncups;
            
    }

    public static void main(String[] args) {
        Cafe compass =new Cafe("compass", "1 Chapin Way 01063", 1);
        System.out.println(compass);


    }
    
}
