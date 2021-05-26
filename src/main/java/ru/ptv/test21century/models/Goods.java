package ru.ptv.test21century.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 25.05.2021 15:55
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Goods {
    /**
     * Goods identifier.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    /**
     * Goods name.
     */
    @Column(length = 50, nullable = false)
    private String name;
    /**
     * Goods price.
     */
    @Column(nullable = false)
    private Double price;
}
