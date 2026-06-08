package com.securityvault; // Adicione isso no topo do seu Main.java
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class InvoiceEntity implements VaultEntity {
    private final String id;
    private final ClientEntity client;
    private final List<ItemEntity> items;
    private final double totalValue;

    public InvoiceEntity(ClientEntity client, List<ItemEntity> items) {
        if (client == null) throw new IllegalArgumentException("Cliente é obrigatório para emitir nota.");
        if (items == null || items.isEmpty()) throw new IllegalArgumentException("Nota deve conter ao menos um item.");

        this.id = UUID.randomUUID().toString();
        this.client = client;
        // Defesa: tornamos a lista imutável para evitar adulteração fora do construtor
        this.items = Collections.unmodifiableList(items);
        this.totalValue = calculateTotal(items);
    }

    private double calculateTotal(List<ItemEntity> items) {
        return items.stream().mapToDouble(ItemEntity::getSubtotal).sum();
    }

    @Override
    public String getId() { return id; }
    
    // Getters apenas (Sem setters, pois a nota fiscal é imutável uma vez emitida)

public double getTotalValue() {
    return this.totalValue;
}
}