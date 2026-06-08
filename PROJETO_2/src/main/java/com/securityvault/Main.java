package com.securityvault; // Adicione isso no topo do seu Main.java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Setup: Inicializando os repositórios
        VaultRepository<ClientEntity> clientRepo = new ClientRepositoryImpl();
        VaultRepository<ProductEntity> productRepo = new ProductRepositoryImpl();
        VaultRepository<InvoiceEntity> invoiceRepo = new InvoiceRepositoryImpl();

        // 2. Mocking de dados
        ClientEntity c1 = new ClientEntity("1", "João Silva");
        ProductEntity p1 = new ProductEntity("P1", "Laptop Gamer", 4500.00);
        ProductEntity p2 = new ProductEntity("P2", "Mouse Sem Fio", 150.00);
        
        clientRepo.save(c1);
        productRepo.save(p1);
        productRepo.save(p2);

        // 3. Injeção de dependência no Serviço
        SalesVaultService service = new SalesVaultService(clientRepo, productRepo, invoiceRepo);

        // 4. Execução da Venda
        try {
            System.out.println("Iniciando processamento de venda...");
            InvoiceEntity nota = service.processSale("1", List.of("P1", "P2"));
            
            System.out.println("Venda concluída com sucesso!");
            System.out.println("ID da Nota Fiscal: " + nota.getId());
            System.out.println("Total da nota: R$ " + nota.getTotalValue());
            
        } catch (Exception e) {
            System.err.println("Erro ao processar venda: " + e.getMessage());
        }
    }
}