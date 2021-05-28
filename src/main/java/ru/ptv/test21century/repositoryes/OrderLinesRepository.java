package ru.ptv.test21century.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ptv.test21century.models.OrderLines;

/**
 * 27.05.2021 19:16
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@Repository
public interface OrderLinesRepository extends JpaRepository<OrderLines, Long> {
}
