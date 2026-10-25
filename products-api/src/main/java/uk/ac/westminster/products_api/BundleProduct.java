// Stretch task: is a BundleProduct really an IS-A Product, or a HAS-A hiding inside an extends?
// My answer: it is genuinely BOTH, and that is fine. "A bundle is a Product" passes the test - it is sold in the catalogue
// like any other product (own id, name and price), it sits in the same List<Product>, and a customer buys it as ONE item.
// The HAS-A is real too, but it is not hidden inside the extends - it is the List<Product> items field below.
// So: extends Product describes how a bundle is SOLD, the field describes what it CONTAINS.
// The weak spot of the IS-A side: price is stored rather than worked out from the items, and things like weightKg or
// downloadUrl only make sense for the items inside it, not for the bundle itself.
package uk.ac.westminster.products_api;

import java.util.ArrayList;
import java.util.List;

public class BundleProduct extends Product {
    private List<Product> items = new ArrayList<>();

    // no-arg constructor for Jackson
    public BundleProduct() {}

    public BundleProduct(Long id, String name, double price, List<Product> items) {
        super(id, name, price);
        this.items = items;
    }

    // the items can be any mix of DigitalProduct and PhysicalProduct - they are all Products
    public List<Product> getItems() {
        return items;
    }
}
