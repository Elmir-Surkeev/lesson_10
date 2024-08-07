
class Container {
    private double volume;//единица измерения
    private String material;

    public Container(double volume, String material) {
        this.volume = volume;
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }
//
//    public void setVolume(double volume) {
//        this.volume = volume;
//    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Container{" +
                "volume=" + volume +
                ", material='" + material + '\'' +
                '}';
    }
}