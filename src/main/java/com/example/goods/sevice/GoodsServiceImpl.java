package com.example.goods.sevice;

import com.example.goods.dao.GoodsRepository;
import com.example.goods.entity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {

    private final GoodsRepository goodsRepository;

    public GoodsServiceImpl(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @Override
    public List<Goods> findAll() {
        return goodsRepository.findAll();
    }

    @Override
    public Goods findById(int theId) {
        Optional<Goods> result = goodsRepository.findById(theId);
        Goods goods;
        if (result.isPresent()) {
            goods = result.get();
        } else {
            throw new RuntimeException("Did not find item id - " + theId);
        }
        return goods;
    }

    @Override
    public void save(Goods goods) {
        goodsRepository.save(goods);
    }

    @Override
    public void deleteById(int theId) {
        goodsRepository.deleteById(theId);
    }
}
