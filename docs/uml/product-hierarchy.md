# Product Hierarchy  UML Class Diagram

5COSC019W Tutorial 4, Activity 4. Inheritance: a DigitalProduct IS-A Product, and a PhysicalProduct IS-A Product.
PlantUML version of the same diagram: [product-hierarchy.puml](product-hierarchy.puml).

```mermaid
classDiagram
    class Product {
        -Long id
        -String name
        -double price
        +Product()
        +Product(Long id, String name, double price)
        +getId() Long
        +getName() String
        +getPrice() double
        +setId(Long id) void
        +setName(String name) void
        +setPrice(double price) void
    }

    class DigitalProduct {
        -String downloadUrl
        -double fileSizeMB
        +DigitalProduct()
        +DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB)
        +getDownloadUrl() String
        +getFileSizeMB() double
    }

    class PhysicalProduct {
        -double weightKg
        -String dimensions
        +PhysicalProduct()
        +PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions)
        +getWeightKg() double
        +getDimensions() String
    }

    %% <|-- is inheritance (generalisation): SOLID line, HOLLOW triangle at the PARENT end
    Product <|-- DigitalProduct
    Product <|-- PhysicalProduct
```

Checks (Task 16):
- (a) the hollow triangle touches `Product`, not the children
- (b) neither child box repeats `id`, `name` or `price`; they are inherited
- (c) fields are marked `-` (private) and methods are marked `+` (public)
