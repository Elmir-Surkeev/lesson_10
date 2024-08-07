class ContainerWithLid extends Container {
    private boolean hasLid;

    public ContainerWithLid(double volume, String material, boolean hasLid) {
        super(volume, material);
        this.hasLid = hasLid;
    }

    public boolean hasLid() {
        return hasLid;
    }

    public void setHasLid(boolean hasLid) {
        this.hasLid = hasLid;
    }

    @Override
    public String toString() {
        return "ContainerWithLid{" +
                "volume=" + getVolume() +
                ", material='" + getMaterial() + '\'' +
                ", hasLid=" + hasLid +
                '}';
    }
}
