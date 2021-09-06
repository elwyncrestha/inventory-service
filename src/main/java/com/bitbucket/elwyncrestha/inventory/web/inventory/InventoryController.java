package com.bitbucket.elwyncrestha.inventory.web.inventory;

import com.bitbucket.elwyncrestha.inventory.api.inventory.entity.Inventory;
import com.bitbucket.elwyncrestha.inventory.api.inventory.service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(InventoryController.URL)
public class InventoryController {

    static final String URL = "/v1/inventory";

    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Inventory inventory) {
        return ResponseEntity.ok(service.save(inventory));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<Inventory> list = service.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        Optional<Inventory> inventory = service.findOne(id);
        if (!inventory.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(inventory.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteByid(@PathVariable Long id) {
        Optional<Inventory> inventory = service.findOne(id);
        if (!inventory.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        service.deleteById(id);
        return ResponseEntity.ok(id);
    }
}
