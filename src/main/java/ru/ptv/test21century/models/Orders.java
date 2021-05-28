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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@DynamicInsert
@DynamicUpdate
public class Orders extends AbstractEntity {
    /**
     * Order client.
     */
    @Column(length = 100, nullable = false)
    private String client;
    /**
     * Order date and time.
     */
    @Column(nullable = false)
    private Timestamp date;
    /**
     * Client address.
     */
    @Column(length = 100, nullable = false)
    private String address;
//    /**
//     * Relationship with orderLines.
//     */
//    @OneToOne(cascade = CascadeType.REFRESH)
//    private OrderLines orderLines;
}
