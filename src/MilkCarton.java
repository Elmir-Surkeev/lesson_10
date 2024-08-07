class MilkCarton extends Container {
    private String expirationDate; // срок годности

    public MilkCarton(double volume, String material, String expirationDate) {
        super(volume, material);
        this.expirationDate = expirationDate;
    }

//    public String getExpirationDate() {
//        return expirationDate;
//    }
//
//    public void setExpirationDate(String expirationDate) {
//        this.expirationDate = expirationDate;
//    }

    @Override
    public String toString() {
        return "MilkCarton{" +
                "volume=" + getVolume() +
                ", material='" + getMaterial() + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
