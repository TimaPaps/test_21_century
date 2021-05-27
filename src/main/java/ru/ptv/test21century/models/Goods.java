package ru.ptv.test21century.models;

import lombok.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

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
@DynamicInsert
@DynamicUpdate
@Table(name = "goods")
public class Goods {
    /**
     * Goods identifier.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    /**
     * Goods name.
     */
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    /**
     * Goods price.
     */
    @Column(name = "price", nullable = false)
    private Double price;
}
