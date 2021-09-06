package com.bitbucket.elwyncrestha.inventory.api.inventory.repository;

import com.bitbucket.elwyncrestha.inventory.api.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
