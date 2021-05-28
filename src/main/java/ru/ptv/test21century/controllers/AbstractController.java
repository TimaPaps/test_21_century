package ru.ptv.test21century.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import ru.ptv.test21century.models.AbstractEntity;
import ru.ptv.test21century.services.CommonService;

/**
 * 28.05.2021 16:29
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
public abstract class AbstractController<E extends AbstractEntity, S extends CommonService<E>>
        implements CommonController<E> {

    protected final S service;

//    @Autowired
    protected AbstractController(S service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<E> add(E entity) {
        return null;
    }

    @Override
    public ResponseEntity<E> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<E> findById(Long id) {
        return null;
    }
}
