package ru.ptv.test21century.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ptv.test21century.models.OrderLines;
import ru.ptv.test21century.repositoryes.OrderLinesRepository;

import java.util.List;

/**
 * 27.05.2021 19:17
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@RestController
public class OrderLinesController implements ApplicationRunner {
    /**
     *
     */
    private final OrderLinesRepository orderLinesRepository;

    @Autowired
    public OrderLinesController(OrderLinesRepository orderLinesRepository) {
        this.orderLinesRepository = orderLinesRepository;
    }

    @PostMapping("/order_lines")
    public OrderLines add(@RequestBody OrderLines orderLines) {
        orderLinesRepository.save(orderLines);
        return orderLines;
    }

    @GetMapping("/order_lines")
    public List<OrderLines> findAll() {
        return orderLinesRepository.findAll();
    }

    public OrderLines findById(Long id) {
        return orderLinesRepository.getById(id);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Long count = orderLinesRepository.count();

        if (count == 0) {
            OrderLines orderLines1 = OrderLines.builder().order_id(1L).goods_id(1L).build();
            OrderLines orderLines2 = OrderLines.builder().order_id(1L).goods_id(2L).build();
            OrderLines orderLines3 = OrderLines.builder().order_id(2L).goods_id(2L).build();
            add(orderLines1);
            add(orderLines2);
            add(orderLines3);
        }
    }
}
