public class Main {
    public static void main(String[] args) {
        Mug mug = new Mug(0.3, "Ceramic", true, true);
        Pot pot = new Pot(5, "Stainless Steel", true, true);
        Bottle bottle = new Bottle(1.5, "Plastic", "Screw Cap");
        MilkCarton milkCarton = new MilkCarton(1, "Cardboard", "2024-12-31");

        System.out.println(mug);
        System.out.println(pot);
        System.out.println(bottle);
        System.out.println(milkCarton);
    }
}
