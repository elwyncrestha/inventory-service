package com.bitbucket.elwyncrestha.inventory.web.subscription;

import com.bitbucket.elwyncrestha.inventory.api.subscription.entity.Subscription;
import com.bitbucket.elwyncrestha.inventory.api.subscription.service.SubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(SubscriptionController.URL)
public class SubscriptionController {

    static final String URL = "/v1/subscription";

    private final SubscriptionService service;

    public SubscriptionController(SubscriptionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Subscription subscription) {
        return ResponseEntity.ok(service.save(subscription));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<Subscription> list = service.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        Optional<Subscription> inventory = service.findOne(id);
        if (!inventory.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(inventory.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        Optional<Subscription> inventory = service.findOne(id);
        if (!inventory.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        service.deleteById(id);
        return ResponseEntity.ok(id);
    }
}
