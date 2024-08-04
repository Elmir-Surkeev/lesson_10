public class CapacityWithLid extends Capacity{
    boolean lid;
    public CapacityWithLid(String name, String material, double weight, boolean lid){
        super(name, material, weight);
        this.lid = lid;
    }
    public void displayLid(){
        System.out.println("name " + name + " weight "+weight + " material " + material + " have a lid " + lid);
    }
}
