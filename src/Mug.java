abstract class Mug extends Capacity{
    boolean handle;
    public Mug(String name, String material, double weight, boolean handle){
        super(name, material, weight);
        this.handle = handle;
    }
    public void displayMug(){
        System.out.println("name " + name + " weight "+weight + " material " + material + " have handle " + handle );
    }
}
