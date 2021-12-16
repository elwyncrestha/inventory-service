package com.bitbucket.elwyncrestha.inventory.api.subscription.entity;

import com.bitbucket.elwyncrestha.inventory.core.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Subscription extends BaseEntity<Long> {

    private String email;
}
