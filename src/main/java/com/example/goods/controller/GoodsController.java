package com.example.goods.controller;

import com.example.goods.entity.Goods;
import com.example.goods.sevice.GoodsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    private final GoodsService goodsService;

    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @GetMapping("/")
    public List<Goods> findAll() {
        return goodsService.findAll();
    }

    @GetMapping("/{goodsId}")
    public Goods getItem(@PathVariable int goodsId) {
        Goods goods = goodsService.findById(goodsId);
        if (goods == null) {
            throw new RuntimeException("Item id not found - " + goodsId);
        }
        return goods;
    }

    @PostMapping("/")
    public Goods addItem(@RequestBody Goods goods) {
        goods.setId(0);
        goodsService.save(goods);
        return goods;
    }

    @PutMapping("/")
    public Goods updateItem(@RequestBody Goods goods) {
        goodsService.save(goods);
        return goods;
    }

    @DeleteMapping("/{goodsId}")
    public String deleteItem(@PathVariable int goodsId) {
        Goods goods = goodsService.findById(goodsId);
        if (goods == null) {
            throw new RuntimeException("Item id not found - " + goodsId);
        }
        goodsService.deleteById(goodsId);
        return "Deleted item id - " + goodsId;
    }

}
