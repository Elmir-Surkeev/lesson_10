//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Capacity packetMilk = new Capacity("Granmother home ", " polietilen", 1);
        CapacityWithLid bottle = new CapacityWithLid("bootle", "plasmassa", 1.5, true);
        CapacityWithLid pot = new CapacityWithLid("pot", "iron", 12, true);
        CapacityWithLid container = new CapacityWithLid("container", "plasmassa", 4, false);
        CapacityWithLid containerWithLid = new CapacityWithLid("container", "plasmassa", 4.5, true);

        Mug mug = new Mug("mug", "farfor", 0.4, true){};
        packetMilk.display();
        bottle.displayLid();
        pot.displayLid();
        container.displayLid();
        containerWithLid.displayLid();
        mug.displayMug();
    }
}