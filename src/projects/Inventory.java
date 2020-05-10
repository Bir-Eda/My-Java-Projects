package projects;

public class Inventory {
    public static void main(String[] args) throws Exception {
        InventoryOperations.insertItems(("src/projects/inventory.txt"));
        InventoryOperations.listInventory("src/projects");
    }
}
