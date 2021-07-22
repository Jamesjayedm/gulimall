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

//  @Autowired
//  OSSClient ossClient;
//
//  @Test
//  public void testUpload() throws FileNotFoundException {
//    // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
////    String endpoint = "oss-cn-hangzhou.aliyuncs.com";
////    // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
////    String accessKeyId = "LTAI5tAodsKNRKksRCsU65Bf";
////    String accessKeySecret = "rYHf3tQoWnTtZOPyvw3PZZLkU3Bvha";
////
////    // 创建OSSClient实例。
////    OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//    // 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
//    InputStream inputStream =
//        new FileInputStream("C:\\Users\\63196\\Pictures\\壁纸工作室\\backiee-172.jpg");
//    // 依次填写Bucket名称（例如examplebucket）和Object完整路径（例如exampledir/exampleobject.txt）。Object完整路径中不能包含Bucket名称。
//    ossClient.putObject("gulimall-jamesjay", "backiee-172.jpg", inputStream);
//
//    // 关闭OSSClient。
//    ossClient.shutdown();
//
//    System.out.println("上传成功");
//  }

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
