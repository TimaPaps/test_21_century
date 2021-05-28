package ru.ptv.test21century.services;

import ru.ptv.test21century.models.AbstractEntity;

import java.util.Optional;

/**
 * 28.05.2021 14:56
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
public interface CommonService<E extends AbstractEntity> {
    Optional<E> add(E entity);
    Optional<E> findAll();
    Optional<E> findById(Long id);
}
