public class BatterListing{
    private String name;
    private double average;
    
    public BatterListing(String name, double average){
        this.name = name;
        this.average = average;
    }
    
    public String toString(){
        String listing = name + "   " + average;
        return listing;
    }
    
    public String getName(){
        return name;
    }
    
    public double getAverage(){
        return average;
    }
}
