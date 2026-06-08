package com.securityvault; // Adicione isso no topo do seu Main.java
import java.util.List;
import java.util.Optional;

public class SalesVaultService {

    // Injeção de dependência via construtor (Interface over Implementation)
    private final VaultRepository<ClientEntity> clientRepo;
    private final VaultRepository<ProductEntity> productRepo;
    private final VaultRepository<InvoiceEntity> invoiceRepo;

    public SalesVaultService(
            VaultRepository<ClientEntity> clientRepo,
            VaultRepository<ProductEntity> productRepo,
            VaultRepository<InvoiceEntity> invoiceRepo) {
        this.clientRepo = clientRepo;
        this.productRepo = productRepo;
        this.invoiceRepo = invoiceRepo;
    }

    /**
     * Processa uma nova venda no "Cofre"
     */
    public InvoiceEntity processSale(String clientId, List<String> productIds) {
        // 1. Validação de Existência (Regra de Negócio)
        ClientEntity client = clientRepo.findById(clientId)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado no Vault."));

        // 2. Montagem dos itens (Transformação)
        List<ItemEntity> items = productIds.stream()
                .map(id -> productRepo.findById(id)
                        .orElseThrow(() -> new IllegalArgumentException("Produto " + id + " não localizado.")))
                .map(product -> new ItemEntity(product, 1)) // Exemplo: 1 unidade por padrão
                .toList();

        // 3. Cálculo de Total e Criação da Nota
        double total = items.stream().mapToDouble(ItemEntity::getSubtotal).sum();
        InvoiceEntity newInvoice = new InvoiceEntity(client, items);

        // 4. Persistência
        invoiceRepo.save(newInvoice);

        return newInvoice;
    }
}