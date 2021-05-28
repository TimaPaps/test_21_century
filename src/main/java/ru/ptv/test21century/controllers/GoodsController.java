package ru.ptv.test21century.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ptv.test21century.models.Goods;
import ru.ptv.test21century.repositoryes.GoodsRepository;

import java.util.List;

/**
 * 25.05.2021 20:55
 * test_21_century
 *
 * @author Papsuev Timofey
 * @version v1.0
 */
@RestController
public class GoodsController implements ApplicationRunner {
    /**
     *
     */
    private final GoodsRepository goodsRepository;

    @Autowired
    public GoodsController(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @PostMapping("/goods")
    public Goods add(@RequestBody Goods goods) {
        goodsRepository.save(goods);
        return goods;
    }

    public Goods update(@RequestBody Goods goods) {
        Goods goodsInDb = goodsRepository.getById(goods.getId());
        goodsInDb.setName(goods.getName());
        goodsInDb.setPrice(goods.getPrice());
        goodsRepository.save(goodsInDb);
        return goodsInDb;
    }

    public Long delete(Goods goods) {
        goodsRepository.delete(goods);
        return goods.getId();
    }

    @GetMapping("/goods")
    public List<Goods> findAll() {
        return goodsRepository.findAll();
    }

    public Goods findById(Long id) {
        return goodsRepository.getById(id);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = goodsRepository.count();

        if (count == 0) {
            Goods goods1 = Goods.builder().name("Линейка").price(25.5).build();
            Goods goods2 = Goods.builder().name("Ластик").price(35.0).build();
            add(goods1);
            add(goods2);
        }
    }
}
