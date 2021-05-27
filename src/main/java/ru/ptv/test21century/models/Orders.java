package ru.ptv.test21century.models;

import lombok.*;
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
@ToString(exclude = "orderLines")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "orders")
public class Orders {
    /**
     * Order identifier.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    /**
     * Order client.
     */
    @Column(name = "client", length = 100, nullable = false)
    private String client;
    /**
     * Order date and time.
     */
    @Column(name = "date", nullable = false)
    private Timestamp date;
    /**
     * Client address.
     */
    @Column(name = "address", length = 100, nullable = false)
    private String address;
    /**
     * Relationship with orderLines.
     */
    @OneToOne(mappedBy = "orders")
    private OrderLines orderLines;
}
