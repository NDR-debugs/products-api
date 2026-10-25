package uk.ac.westminster.products_api;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

// Tutorial 4: POST /products takes a Product, so without this Jackson always builds a plain Product
// and silently drops downloadUrl / weightKg. DEDUCTION picks the subclass from the fields in the JSON
// (downloadUrl -> DigitalProduct, weightKg -> PhysicalProduct, only id/name/price -> Product).
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, defaultImpl = Product.class)
@JsonSubTypes({
        @JsonSubTypes.Type(DigitalProduct.class),
        @JsonSubTypes.Type(PhysicalProduct.class),
        @JsonSubTypes.Type(BundleProduct.class)
})
public class Product {
    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product (Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }
    public String getName() { //IMPORTANT Getter removal will drop the field from Json without n error message! Be careful
        return name;
    }
    public double getPrice() {
        return price;
    }


    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
