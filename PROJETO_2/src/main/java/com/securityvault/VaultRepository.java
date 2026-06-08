package com.securityvault;
import java.util.List;
import java.util.Optional;

public interface VaultRepository<T> {
    void save(T entity);
    Optional<T> findById(String id);
    List<T> findAll(); // Certifique-se que o retorno é List<T>
}