package ru.ptv.test21century.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.ptv.test21century.models.AbstractEntity;
import ru.ptv.test21century.repositoryes.CommonRepository;

import java.util.Optional;

/**
 * 28.05.2021 15:11
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
public abstract class AbstractService<E extends AbstractEntity, R extends CommonRepository<E>>
        implements CommonService<E> {

    protected final R repository;

//    @Autowired
    public AbstractService(R repository) {
        this.repository = repository;
    }

    abstract Optional<E> update(E entity);
    abstract Optional<E> delete(E entity);
}
