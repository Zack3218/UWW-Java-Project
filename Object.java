public class BatterListing{
    private String name;
    private double average;
    
    public BatterListing(String name, double average){
        this.name = name;
        this.average = average;
    }
    
    public String toString(){
        return String.format("%-24s%-5.3f", name, average);
    }
    
    public String getName(){
        return name;
    }
    
    public double getAverage(){
        return average;
    }
}
