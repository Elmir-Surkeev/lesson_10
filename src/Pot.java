class Pot extends ContainerWithLid {
    private boolean isStoveSafe; // жир на сковороде

    public Pot(double volume, String material, boolean hasLid, boolean isStoveSafe) {
        super(volume, material, hasLid);
        this.isStoveSafe = isStoveSafe;
    }

    public boolean isStoveSafe() {
        return isStoveSafe;
    }

    public void setStoveSafe(boolean stoveSafe) {
        isStoveSafe = stoveSafe;
    }

    @Override
    public String toString() {
        return "Pot{" +
                "volume=" + getVolume() +
                ", material='" + getMaterial() + '\'' +
                ", hasLid=" + hasLid() +
                ", isStoveSafe=" + isStoveSafe +
                '}';
    }
}
