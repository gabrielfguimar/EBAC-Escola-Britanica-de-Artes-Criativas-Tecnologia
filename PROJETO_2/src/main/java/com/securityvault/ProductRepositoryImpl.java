package com.securityvault; // Adicione isso no topo do seu Main.java

public class ProductRepositoryImpl extends AbstractVaultRepository<ProductEntity> {
    // A lógica de persistência em memória já está herdada de AbstractVaultRepository.
    // Esta classe serve como uma especialização para ProductEntity.
}