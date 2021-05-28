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
public class Goods extends AbstractEntity {
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
//    /**
//     * Relationship with orderlines.
//     */
//    @ManyToOne(cascade = CascadeType.REFRESH)
//    @JoinColumn
//    private OrderLines orderLines;
}
