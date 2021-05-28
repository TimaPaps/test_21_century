package ru.ptv.test21century.services;

import org.springframework.stereotype.Service;
import ru.ptv.test21century.models.Orders;
import ru.ptv.test21century.repositoryes.OrderRepository;

import java.util.Optional;

/**
 * 28.05.2021 15:34
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@Service
public class OrdersService extends AbstractService<Orders, OrderRepository> {
    public OrdersService(OrderRepository repository) {
        super(repository);
    }

    @Override
    Optional<Orders> update(Orders entity) {
        return Optional.empty();
    }

    @Override
    Optional<Orders> delete(Orders entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Orders> add(Orders entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Orders> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<Orders> findById(Long id) {
        return Optional.empty();
    }
}
