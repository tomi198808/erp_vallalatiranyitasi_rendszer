package hu.nye.service;

import hu.nye.model.Product;

/**
 * Interface for managing inventory operations.
 * This interface defines methods for adding, removing, and checking the quantity of products in the inventory.
 */
public interface InventoryServiceInterface {

    /**
     * Adds a specified quantity of a product to the inventory.
     *
     * @param product The product to be added to the inventory.
     * @param quantity The quantity of the product to be added.
     */
    void addProductToInventory(Product product, int quantity);

    /**
     * Removes a specified quantity of a product from the inventory.
     *
     * @param product The product to be removed from the inventory.
     * @param quantity The quantity of the product to be removed.
     */
    void removeProductFromInventory(Product product, int quantity);

    /**
     * Checks the current quantity of a specified product in the inventory.
     *
     * @param product The product to check the inventory for.
     * @return The quantity of the specified product in the inventory. Returns 0 if the product is not found.
     */
    int checkInventory(Product product);
}
