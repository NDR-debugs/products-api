// A PhysicalProduct IS-A Product because it is still an item in the catalogue with an id, a name and a price - it just also gets shipped, so it adds a weight and dimensions.
// A ShoppingCart would NOT pass this test: "a ShoppingCart is a Product" sounds wrong - a cart HAS-A list of products, so it holds them in a field instead of extending Product.
package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // (a) no-arg constructor for Jackson
    public PhysicalProduct() {}

    // (b) full constructor
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // (c) getters
    public double getWeightKg() {
        return weightKg;
    }
    public String getDimensions() {
        return dimensions;
    }
}
