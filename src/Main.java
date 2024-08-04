//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Capacity bottle = new Capacity("bootle", "plasmassa", 12);
        Mug mug = new Mug("mug", "farfor", 0.4, true) {
            @Override
            public void displayMug() {
                super.displayMug();
            }
        };
        mug.displayMug();
    }
}