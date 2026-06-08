package com.securityvault; // Adicione isso no topo do seu Main.java

public class ProductEntity implements VaultEntity {
    private final String id;
    private final String description;
    private final double price;

    public ProductEntity(String id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
