package com.securityvault; // Adicione isso no topo do seu Main.java

public class ItemEntity {
    private final ProductEntity product;
    private final int quantity;

    public ItemEntity(ProductEntity product, int quantity) {
        if (product == null) throw new IllegalArgumentException("O item deve ter um produto associado.");
        if (quantity <= 0) throw new IllegalArgumentException("A quantidade deve ser superior a zero.");
        
        this.product = product;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
    
    // Getters
}