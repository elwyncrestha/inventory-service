package com.bitbucket.elwyncrestha.inventory.api.subscription.service;

import com.bitbucket.elwyncrestha.inventory.api.subscription.entity.Subscription;
import com.bitbucket.elwyncrestha.inventory.api.subscription.repository.SubscriptionRepository;
import com.bitbucket.elwyncrestha.inventory.core.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionService implements BaseService<Subscription, Long> {

    private final SubscriptionRepository repository;

    public SubscriptionService(SubscriptionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Subscription save(Subscription inventory) {
        return repository.save(inventory);
    }

    @Override
    public Optional<Subscription> findOne(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Subscription> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
