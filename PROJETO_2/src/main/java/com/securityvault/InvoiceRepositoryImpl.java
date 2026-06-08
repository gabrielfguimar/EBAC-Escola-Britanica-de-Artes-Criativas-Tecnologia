package com.securityvault; // Adicione isso no topo do seu Main.java

public class InvoiceRepositoryImpl extends AbstractVaultRepository<InvoiceEntity> {
    // Esta classe serve como uma especialização para InvoiceEntity.
    // Futuramente, você pode adicionar métodos específicos aqui, 
    // como "findByClientId(String clientId)".
}