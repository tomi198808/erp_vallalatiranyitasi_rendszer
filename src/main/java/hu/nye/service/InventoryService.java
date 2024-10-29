public class InventoryService implements InventoryServiceInterface {
    private Map<Product, Integer> inventory = new HashMap<>();

    @Override
    public void addProductToInventory(Product product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product, 0) + quantity);
    }

    @Override
    public void removeProductFromInventory(Product product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product, 0) - quantity);
    }

    @Override
    public int checkInventory(Product product) {
        return inventory.getOrDefault(product, 0);
    }
}