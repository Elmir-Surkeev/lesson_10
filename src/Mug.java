class Mug extends ContainerWithLid {
    private boolean hasHandle; // наличие ручки

    public Mug(double volume, String material, boolean hasLid, boolean hasHandle) {
        super(volume, material, hasLid);
        this.hasHandle = hasHandle;
    }

    public boolean hasHandle() {
        return hasHandle;
    }

//    public void setHasHandle(boolean hasHandle) {
//        this.hasHandle = hasHandle;
//    }

    @Override
    public String toString() {
        return "Mug{" +
                "volume=" + getVolume() +
                ", material='" + getMaterial() + '\'' +
                ", hasLid=" + hasLid() +
                ", hasHandle=" + hasHandle +
                '}';
    }
}
