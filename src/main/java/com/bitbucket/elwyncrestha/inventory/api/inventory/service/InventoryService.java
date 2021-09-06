package com.bitbucket.elwyncrestha.inventory.api.inventory.service;

import com.bitbucket.elwyncrestha.inventory.api.inventory.entity.Inventory;
import com.bitbucket.elwyncrestha.inventory.api.inventory.repository.InventoryRepository;
import com.bitbucket.elwyncrestha.inventory.core.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService implements BaseService<Inventory, Long> {

    private final InventoryRepository repository;

    public InventoryService(InventoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Inventory save(Inventory inventory) {
        return repository.save(inventory);
    }

    @Override
    public Optional<Inventory> findOne(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Inventory> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
