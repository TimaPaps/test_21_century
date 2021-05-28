package ru.ptv.test21century.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ptv.test21century.models.AbstractEntity;

/**
 * 28.05.2021 15:44
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
public interface CommonController<E extends AbstractEntity> {

    @PostMapping
    ResponseEntity<E> add(@RequestBody E entity);

    @GetMapping
    ResponseEntity<E> findAll();

    @GetMapping
    ResponseEntity<E> findById(@RequestParam Long id);
}
