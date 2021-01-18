package com.example.goods.sevice;

import com.example.goods.entity.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> findAll();

    Goods findById(int theId);

    void save(Goods goods);

    void deleteById(int theId);
}
