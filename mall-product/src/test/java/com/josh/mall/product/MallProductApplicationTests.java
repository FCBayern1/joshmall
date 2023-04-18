package com.josh.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.josh.mall.product.entity.BrandEntity;
import com.josh.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("hello");
        brandEntity.setName("apple");
        brandService.save(brandEntity);
        System.out.println("保存成功");

//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//        list.forEach((item)->{
//            System.out.println(item);
//        });
    }

}
