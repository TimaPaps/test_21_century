package ru.ptv.test21century.models;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

/**
 * 25.05.2021 15:54
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@Data
@ToString(exclude = "goodsSet")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "order_lines")
public class OrderLines {
    /**
     * OrderLines identifier.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    /**
     * Order identifier.
     */
    @Column(name = "order_id", nullable = false, insertable = false, updatable = false)
    private Long order_id;
    /**
     * Goods identifier.
     */
    @Column(name = "goods_id", nullable = false)
    private Long goods_id;
    /**
     * Count goods.
     */
    @Column(name = "count")
    private Long count;
    /**
     * Relationship with orders.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    private Orders orders;
    /**
     * Relationship with goods.
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orderLines")
    private Set<Goods> goodsSet;
}
