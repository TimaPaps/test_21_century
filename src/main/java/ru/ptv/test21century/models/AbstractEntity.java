package ru.ptv.test21century.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 28.05.2021 13:51
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@Data
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    private Long id;

    /**
     * Identifier.
     *
     * @return - Long, id.
     */
    @Id
    @GeneratedValue
    @Column(nullable = false)
    public Long getId() {
        return id;
    }
}
