package com.bitbucket.elwyncrestha.inventory.core.service;

import java.util.List;
import java.util.Optional;

/**
 * @param <T> An entity type.
 * @param <I> An entity ID type.
 *
 * @author Elvin Shrestha on 9/06/2021
 */
public interface BaseService<T, I> {

    T save(T t);

    Optional<T> findOne(I id);

    List<T> getAll();

    void deleteById(I id);

}
