public class Capacity {
    String name;
    String material;
    double weight;

    public Capacity(String name, String material,double weight){
        this.name = name;
        this.material = material;
        this.weight = weight;
    }
    public void display(){
        System.out.println(name + "weight "+weight + "material " + material);
    }
}

