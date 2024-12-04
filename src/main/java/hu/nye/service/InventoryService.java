package hu.nye.service;

import java.util.Map;
import java.util.HashMap;
import hu.nye.model.Product;

/**
 * Service class for managing inventory of products.
 * This class provides methods to add, remove, and check the quantity of products in the inventory.
 */
public class InventoryService implements InventoryServiceInterface {
    private Map<Product, Integer> inventory = new HashMap<>();

    /**
     * Adds a specified quantity of a product to the inventory.
     *
     * @param product The product to be added to the inventory.
     * @param quantity The quantity of the product to be added.
     */
    @Override
    public void addProductToInventory(Product product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product, 0) + quantity);
    }

    /**
     * Removes a specified quantity of a product from the inventory.
     *
     * @param product The product to be removed from the inventory.
     * @param quantity The quantity of the product to be removed.
     */
    @Override
    public void removeProductFromInventory(Product product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product, 0) - quantity);
    }

    /**
     * Checks the current quantity of a specified product in the inventory.
     *
     * @param product The product to check the inventory for.
     * @return The quantity of the specified product in the inventory. Returns 0 if the product is not found.
     */
    @Override
    public int checkInventory(Product product) {
        return inventory.getOrDefault(product, 0);
    }
}
