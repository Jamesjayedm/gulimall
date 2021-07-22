package com.james.gulimall.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallGatewayApplicationTests {

  @Value("${test.user.name}")
  private String username;
  @Test
  void contextLoads() {
    System.out.println(username);
  }
}
