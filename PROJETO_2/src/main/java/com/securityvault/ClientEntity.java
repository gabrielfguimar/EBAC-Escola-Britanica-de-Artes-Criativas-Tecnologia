package com.securityvault; // Adicione isso no topo do seu Main.java

public class ClientEntity implements VaultEntity {
    private final String id;
    private final String name;

    public ClientEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}