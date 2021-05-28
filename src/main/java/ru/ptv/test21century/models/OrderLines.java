package ru.ptv.test21century.models;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * 25.05.2021 15:54
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
public class OrderLines extends AbstractEntity {
    /**
     * Order identifier.
     */
    @Column(nullable = false)
    private Long order_id;
    /**
     * Goods identifier.
     */
    @Column(nullable = false)
    private Long goods_id;
    /**
     * Count goods.
     */
    @Column
    private Long count;
    /**
     * Relationship with orders.
     */
    @OneToOne(mappedBy = "orderLines")
    @JoinColumn
    private Orders orders;
//    /**
//     * Relationship with goods.
//     */
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orderLines")
//    private Set<Goods> goodsSet;
}
