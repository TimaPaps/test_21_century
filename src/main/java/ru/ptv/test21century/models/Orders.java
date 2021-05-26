package ru.ptv.test21century.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Orders {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    /**
     *
     */
    @Column(length = 100, nullable = false)
    private String client;
    /**
     *
     */
    @Column(nullable = false)
    private Timestamp date;
    /**
     *
     */
    @Column(length = 100, nullable = false)
    private String address;
}
