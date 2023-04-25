/* This is a stub for the Cafe class */
public class Cafe extends Building{
    //*The number of ounces of coffee remaining in inventory*/
    private int nCoffeeOunces;
    //*  The number of sugar packets remaining in inventory*/
    private int nSugarPackets;
     //* The number of "splashes" of cream remaining in inventory*/
    private int nCreams; 
    //* The number of cups remaining in inventory*/
    private int nCups; 
    public Cafe(String name,String address, int nFloors,int nCoffeeOunces,int nSugarPackets,int nCreams,int nCups ) {
        // System.out.println("You have built a cafe: ☕");
        super(name,address,nFloors);
        this.nCoffeeOunces=nCoffeeOunces;
        this.nSugarPackets=nSugarPackets;
        this.nCreams=nCreams;
        this.nCups=nCups;


    }
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (nCoffeeOunces<1){
            this.restock(100, 0 , 0,0);
        }
        if (nSugarPackets<1){
            this.restock(size, 100, nCreams, nCups);
        }
        if (nCreams<1){
            this.restock(size, nSugarPackets, 100, nCups);
        }
        if (nCups<1){
            this.restock(size, nSugarPackets, nCreams, 100);
        }
        this.nCoffeeOunces-=size;
        this.nSugarPackets-=nSugarPackets;
        this.nCreams-=nCreams;
        this.nCups-=1;

        
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces+=nCoffeeOunces;
        this.nSugarPackets+=nSugarPackets;
        this.nCreams+=nCreams;
        this.nCups+=nCups;
    };
    
    public static void main(String[] args) {
        new Cafe("Ford Hall", "100 Green Street Northampton, MA 01063", 4,6,7,8,9);
    }
    
}
