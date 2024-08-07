class Bottle extends Container {
    private String capType; // тип крышки

    public Bottle(double volume, String material, String capType) {
        super(volume, material);
        this.capType = capType;
    }

    public String getCapType() {
        return capType;
    }

    public void setCapType(String capType) {
        this.capType = capType;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "volume=" + getVolume() +
                ", material='" + getMaterial() + '\'' +
                ", capType='" + capType + '\'' +
                '}';
    }
}

