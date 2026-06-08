package com.securityvault;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public abstract class AbstractVaultRepository<T extends VaultEntity> implements VaultRepository<T> {
    protected final Map<String, T> storage = new ConcurrentHashMap<>();

    public void save(T entity) {
        storage.put(entity.getId(), entity);
    }

    public Optional<T> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
public List<T> findAll() {
    return new ArrayList<>(storage.values());
}
}
