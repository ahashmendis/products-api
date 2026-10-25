package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it shares
// the common product fields and behaviour.
public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    // No-arg constructor
    public PhysicalProduct() {
    }

    // Full constructor
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}