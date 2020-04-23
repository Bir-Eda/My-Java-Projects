package elevenabstractpackage;

public class TilingTest {
    public static void main(String[] args) {
        Tiling myTiles = new Tiling("Ali", 5000, 0, "Wood");
        System.out.println(myTiles.calculateTotalMaterialPrice());
        myTiles.printQuete();
    }
}
