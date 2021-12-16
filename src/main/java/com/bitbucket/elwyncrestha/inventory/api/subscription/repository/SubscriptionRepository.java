package com.bitbucket.elwyncrestha.inventory.api.subscription.repository;

import com.bitbucket.elwyncrestha.inventory.api.subscription.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
