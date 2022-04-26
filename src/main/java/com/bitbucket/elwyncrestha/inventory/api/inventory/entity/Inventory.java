package com.bitbucket.elwyncrestha.inventory.api.inventory.entity;

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
public class Inventory extends BaseEntity<Long> {

    private String name;
    private Integer quantity;
    private Integer price;
}
