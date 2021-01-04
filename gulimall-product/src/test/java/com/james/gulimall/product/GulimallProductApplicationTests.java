package com.james.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimall.product.entity.BrandEntity;
import com.james.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

  @Autowired BrandService brandService;

  @Test
  void contextLoads() {

    BrandEntity brandEntity = new BrandEntity();
    //    brandEntity.setName("荣耀");
    //    brandEntity.setDescript("honor");
    //    brandService.save(brandEntity);
    //    System.out.println("保存成功");

    //    brandEntity.setBrandId(2L);
    //    brandEntity.setName("华为");
    //    brandService.updateById(brandEntity);

    List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "华为"));
    list.forEach(System.out::println);
  }
}
