package ru.ptv.test21century.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ptv.test21century.models.Goods;

/**
 * 25.05.2021 20:58
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@Repository
public interface GoodsRepository extends CommonRepository<Goods> {
}
