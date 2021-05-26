package ru.ptv.test21century.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ptv.test21century.models.Orders;
import ru.ptv.test21century.repositoryes.OrderRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 26.05.2021 12:39
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@RestController
public class OrdersController implements ApplicationRunner {
    /**
     *
     */
    private OrderRepository orderRepository;

    @Autowired
    public OrdersController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping("/orders")
    public Orders add(@RequestBody Orders orders) {
        orderRepository.save(orders);
        return orders;
    }

//    @PostMapping("/orders/update")
    public Orders update(@RequestBody Orders orders) {
        Orders ordersInDb = orderRepository.getById(orders.getId());
        ordersInDb.setClient(orders.getClient());
        ordersInDb.setDate(Timestamp.valueOf(LocalDateTime.now()));
        ordersInDb.setAddress(orders.getAddress());
        orderRepository.save(ordersInDb);
        return ordersInDb;
    }

    public Long delete(Orders orders) {
        orderRepository.delete(orders);
        return orders.getId();
    }

    @GetMapping("/orders")
    public List<Orders> findAll() {
        return orderRepository.findAll();
    }

    public Orders findById(Long id) {
        return orderRepository.getById(id);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = orderRepository.count();

        if (count == 0) {
            Orders order1 = Orders.builder()
                    .client("Иванов Иван Иванович")
                    .date(Timestamp.valueOf(LocalDateTime.now()))
                    .address("г.Первый, ул.Вторая, д.3")
                    .build();
            Orders order2 = Orders.builder()
                    .client("Петров Петр Петрович")
                    .date(Timestamp.valueOf(LocalDateTime.now()))
                    .address("г.Второй, ул.Третья, д.4")
                    .build();
            add(order1);
            add(order2);
//            orderRepository.save(order1);
//            orderRepository.save(order2);
        }
    }
}
