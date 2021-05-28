package ru.ptv.test21century.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.ptv.test21century.models.AbstractEntity;

/**
 * 28.05.2021 14:47
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@NoRepositoryBean
public interface CommonRepository<E extends AbstractEntity> extends JpaRepository<E, Long> {
}
