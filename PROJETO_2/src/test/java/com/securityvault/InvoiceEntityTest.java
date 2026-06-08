package com.securityvault;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceEntityTest {

    @Test
    @DisplayName("Deve calcular o valor total da nota com sucesso")
    void shouldCalculateTotalValueCorrectly() {
        // Arrange
        ProductEntity p1 = new ProductEntity("1", "Notebook", 5000.0);
        ProductEntity p2 = new ProductEntity("2", "Mouse", 100.0);
        ClientEntity client = new ClientEntity("C1", "Cliente Teste");
        
        List<ItemEntity> items = List.of(
            new ItemEntity(p1, 1),
            new ItemEntity(p2, 2) // 5000 + 200 = 5200
        );

        // Act
        InvoiceEntity invoice = new InvoiceEntity(client, items);

        // Assert
        assertEquals(5200.0, invoice.getTotalValue(), "O cálculo do total está incorreto.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao criar nota sem cliente")
    void shouldThrowExceptionWhenClientIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new InvoiceEntity(null, List.of(new ItemEntity(new ProductEntity("1", "P", 10.0), 1)));
        }, "Deveria lançar IllegalArgumentException para cliente nulo.");
    }

    @Test
    @DisplayName("Deve lançar exceção ao tentar criar nota com lista de itens vazia")
    void shouldThrowExceptionWhenItemsAreEmpty() {
        ClientEntity client = new ClientEntity("C1", "Cliente");
        
        assertThrows(IllegalArgumentException.class, () -> {
            new InvoiceEntity(client, List.of());
        }, "Deveria lançar IllegalArgumentException para lista de itens vazia.");
    }
}