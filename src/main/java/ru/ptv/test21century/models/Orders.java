package ru.ptv.test21century.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;

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
@Table(name = "orders")
public class Orders {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    /**
     *
     */
    @Column(name = "client", length = 100, nullable = false)
    private String client;
    /**
     *
     */
    @Column(name = "date", nullable = false)
    private Timestamp date;
    /**
     *
     */
    @Column(name = "address", length = 100, nullable = false)
    private String address;

    @OneToOne(mappedBy = "orders")
    private OrderLines orderLines;
}
