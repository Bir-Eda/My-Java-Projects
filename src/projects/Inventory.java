package projects;

public class Inventory {
    public static void main(String[] args) throws Exception {
       // InventoryOperations.insertItems(("src/projects/inventory.txt"));
        InventoryOperations.listInventory("src/projects");
        //InventoryOperations.listInventory("src/projects/inventory.txt", 70);
        InventoryOperations.listInventory("src/projects/inventory.txt");
        InventoryOperations.listInventory("src/projects/inventory.txt","Tomato");
        InventoryOperations.listInventory("src/projects/inventory.txt",100);

        InventoryOperations.listTotalQuantity("src/projects/inventory.txt");
    }
    }
