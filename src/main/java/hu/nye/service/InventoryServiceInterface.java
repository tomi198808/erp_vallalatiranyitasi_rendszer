public interface InventoryServiceInterface {
    void addProductToInventory(Product product, int quantity);
    void removeProductFromInventory(Product product, int quantity);
    int checkInventory(Product product);
}