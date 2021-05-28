package ru.ptv.test21century.services;

import org.springframework.stereotype.Service;
import ru.ptv.test21century.models.Goods;
import ru.ptv.test21century.repositoryes.GoodsRepository;

import java.util.Optional;

/**
 * 28.05.2021 15:25
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@Service
public class GoodsService extends AbstractService<Goods, GoodsRepository> {
    public GoodsService(GoodsRepository repository) {
        super(repository);
    }

    @Override
    Optional<Goods> update(Goods entity) {
        return Optional.empty();
    }

    @Override
    Optional<Goods> delete(Goods entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Goods> add(Goods entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Goods> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<Goods> findById(Long id) {
        return Optional.empty();
    }
}
