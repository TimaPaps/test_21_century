package ru.ptv.test21century.services;

import org.springframework.stereotype.Service;
import ru.ptv.test21century.models.OrderLines;
import ru.ptv.test21century.repositoryes.OrderLinesRepository;

import java.util.Optional;

/**
 * 28.05.2021 15:36
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@Service
public class OrderLinesService extends AbstractService<OrderLines, OrderLinesRepository> {
    public OrderLinesService(OrderLinesRepository repository) {
        super(repository);
    }

    @Override
    Optional<OrderLines> update(OrderLines entity) {
        return Optional.empty();
    }

    @Override
    Optional<OrderLines> delete(OrderLines entity) {
        return Optional.empty();
    }

    @Override
    public Optional<OrderLines> add(OrderLines entity) {
        return Optional.empty();
    }

    @Override
    public Optional<OrderLines> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<OrderLines> findById(Long id) {
        return Optional.empty();
    }
}
